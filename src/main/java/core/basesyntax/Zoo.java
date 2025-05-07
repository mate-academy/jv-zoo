package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static List<Animal> aquariumAnimals = new ArrayList();
    public static List<Animal> enclosureAnimals = new ArrayList();
    public static List<Animal> aviaryAnimals = new ArrayList();

    public static void sort() {
        for (int i = 0; i < Animal.allAnimals.size(); i++) {
            if (Animal.allAnimals.get(i).habitat().equals("Aquarium")) {
                aquariumAnimals.add(Animal.allAnimals.get(i));
            } else if (Animal.allAnimals.get(i).habitat().equals("Enclosure")) {
                enclosureAnimals.add(Animal.allAnimals.get(i));
            } else if (Animal.allAnimals.get(i).habitat().equals("Aviary")) {
                aviaryAnimals.add(Animal.allAnimals.get(i));
            }
        }
    }

    public static void feed() {
        for (int i = 0; i < Animal.allAnimals.size(); i++) {
            Animal.allAnimals.get(i).eat();
        }
    }
}
