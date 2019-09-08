package core.basesyntax;

import core.basesyntax.type.Animals;
import core.basesyntax.type.Birds;
import core.basesyntax.type.Fishes;
import core.basesyntax.type.Swimming;

import java.util.List;

public class Zoo<I> {
    private I inhabitant;

    public Zoo(I inhabitant) {
        this.inhabitant = inhabitant;
    }

    public void add(I inhabitant) {
        if (inhabitant instanceof Animals) {
            Aviaries.animals.add((Animals) inhabitant);
            return;
        }
        if (inhabitant instanceof Fishes || inhabitant instanceof Swimming) {
            Aviaries.aquarium.add((Swimming) inhabitant);
            return;
        }
        if (inhabitant instanceof Birds) {
            Aviaries.birds.add((Birds) inhabitant);
        }
    }

    public int getAnimalAviarySize() {
        return Aviaries.animals.size();
    }

    public List<Animals> getAnimalAviaryInhabitants() {
        return Aviaries.animals;
    }

    public int getBirdsAviarySize() {
        return Aviaries.birds.size();
    }

    public List<Birds> getBirdsAviaryInhabitants() {
        return Aviaries.birds;
    }

    public int getAquariumSize() {
        return Aviaries.aquarium.size();
    }

    public List<Swimming> getAquariumInhabitants() {
        return Aviaries.aquarium;
    }

}
