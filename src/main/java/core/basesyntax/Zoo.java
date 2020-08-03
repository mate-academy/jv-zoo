package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.birds.Bird;
import core.basesyntax.fishes.Fish;
import java.util.ArrayList;

public class Zoo {
    private ArrayList<ResidentsOfTheZoo> aviaryForAnimals = new ArrayList<>();
    private ArrayList<ResidentsOfTheZoo> aviaryForBirds = new ArrayList<>();
    private ArrayList<ResidentsOfTheZoo> aquariumForFishes = new ArrayList<>();

    public <T extends ResidentsOfTheZoo> void feedAnimals(T resident) {
        resident.eat();
    }

    public <T extends ResidentsOfTheZoo> void addResidentToHabitat(T resident) {
        if (resident instanceof Animal) {
            aviaryForAnimals.add(resident);
        }
        if (resident instanceof Bird) {
            aviaryForBirds.add(resident);
        }
        if (resident instanceof Fish) {
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
