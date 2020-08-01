package core.basesyntax;

import core.basesyntax.animals.Animals;
import core.basesyntax.birds.Birds;
import core.basesyntax.fishes.Fishes;
import java.util.ArrayList;

public class Zoo {
    private ArrayList<ResidentsOfTheZoo> aviaryForAnimals = new ArrayList<>();
    private ArrayList<ResidentsOfTheZoo> aviaryForBirds = new ArrayList<>();
    private ArrayList<ResidentsOfTheZoo> aquariumForFishes = new ArrayList<>();

    public <T extends ResidentsOfTheZoo> void feedAnimals(T resident) {
        resident.eat();
    }

    public <T extends ResidentsOfTheZoo> void addResidentToHabitat(T resident) {
        if (resident instanceof Animals) {
            aviaryForAnimals.add(resident);
        }
        if (resident instanceof Birds) {
            aviaryForBirds.add(resident);
        }
        if (resident instanceof Fishes) {
            aquariumForFishes.add(resident);
        }
    }

    public <T extends ResidentsOfTheZoo> void
                            showInhabitantsOfTheAviaryOrAquarium(ArrayList<T> list) {
        for (T inhabitant : list) {
            inhabitant.displayInfo();
            inhabitant.eat();
            System.out.println("----><----");
        }
    }

    public ArrayList<ResidentsOfTheZoo> getAquariumForFishes() {
        return aquariumForFishes;
    }

    public ArrayList<ResidentsOfTheZoo> getAviaryForAnimals() {
        return aviaryForAnimals;
    }

    public ArrayList<ResidentsOfTheZoo> getAviaryForBirds() {
        return aviaryForBirds;
    }
}
