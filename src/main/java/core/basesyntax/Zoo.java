package core.basesyntax;

import core.basesyntax.type.Animal;
import core.basesyntax.type.Flying;
import core.basesyntax.type.Swimming;

import java.util.List;

public class Zoo<I> {
    private I inhabitant;

    public Zoo() {
    }

    public Zoo(I inhabitant) {
        this.inhabitant = inhabitant;
    }

    public void addToAnimalAviary(Animal inhabitant) {
        getAnimalAviaryInhabitants().add(inhabitant);
    }

    public void addToBirdAviary(Flying inhabitant) {
        getBirdAviaryInhabitants().add(inhabitant);
    }

    public void addToAquarium(Swimming inhabitant) {
        getAquariumInhabitants().add(inhabitant);
    }

    public int getAnimalAviarySize() {
        return Aviary.animals.size();
    }

    public List<Animal> getAnimalAviaryInhabitants() {
        return Aviary.animals;
    }

    public int getBirdsAviarySize() {
        return Aviary.birds.size();
    }

    public List<Flying> getBirdAviaryInhabitants() {
        return Aviary.birds;
    }

    public int getAquariumSize() {
        return Aviary.aquarium.size();
    }

    public List<Swimming> getAquariumInhabitants() {
        return Aviary.aquarium;
    }

}
