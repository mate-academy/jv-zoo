package core.basesyntax;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
    private Map<Enclosure, List<Animal>> enclosures;

    public Zoo() {
        enclosures = new HashMap<>();
        enclosures.put(Enclosure.AVIARY, new ArrayList<>());
        enclosures.put(Enclosure.AQUARIUM, new ArrayList<>());
        enclosures.put(Enclosure.COMMON_ENCLOSURE, new ArrayList<>());
    }

    public void put(Animal animal, boolean toCommonEnclosure) {
        if (!isAlreadyInZoo(animal)) {
            enclosures.get(
                    toCommonEnclosure ? Enclosure.COMMON_ENCLOSURE : determineEnclosure(animal))
                    .add(animal);
        }
    }

    public void setFree(Animal animal) {
        enclosures.get(determineEnclosure(animal)).remove(animal);
        enclosures.get(Enclosure.COMMON_ENCLOSURE).remove(animal);
    }

    public List<Animal> getAllAnimals() {
        return enclosures.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Animal> getAllAnimalsFromEnclosure(Enclosure enclosure) {
        return enclosures.get(enclosure);
    }

    public void moveToCommonEnclosure(Animal animal) {
        setFree(animal);
        put(animal, true);
    }

    public void moveToSpecialEnclosureIfPossible(Animal animal) {
        setFree(animal);
        put(animal, false);
    }

    private Enclosure determineEnclosure(Animal animal) {
        return animal instanceof CanFly ? Enclosure.AVIARY
                : animal instanceof CanSwim ? Enclosure.AQUARIUM
                : Enclosure.COMMON_ENCLOSURE;
    }

    private boolean isAlreadyInZoo(Animal animal) {
        return getAllAnimals().contains(animal);
    }

    public enum Enclosure {
        AVIARY, AQUARIUM, COMMON_ENCLOSURE
    }
}
