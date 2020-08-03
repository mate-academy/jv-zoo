package core.basesyntax;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Animal penguin1 = new Penguin("Mo-mo", 2, "Aquarium");
        Animal shark1 = new Shark("Paulo", 7, "Aquarium");
        Animal tiger1 = new Tiger("Diego", 14, "Enclosure");
        Animal sparrow1 = new Sparrow("Jack", 1, "Aviary");
        Animal penguin2 = new Penguin("Kiko", 8, "Aquarium");
        Animal shark2 = new Shark("Dori", 3, "Aquarium");
        Animal tiger2 = new Tiger("Charla", 4, "Enclosure");
        Animal sparrow2 = new Sparrow("Blacky", 3, "Aviary");

        ArrayList<Animal> aquariumAnimals = new ArrayList();
        ArrayList<Animal> enclosureAnimals = new ArrayList();
        ArrayList<Animal> aviaryAnimals = new ArrayList();

        for (int i = 0; i < Animal.allAnimals.size(); i++) {
            if (Animal.allAnimals.get(i).habitat.equals("Aquarium")) {
                aquariumAnimals.add(Animal.allAnimals.get(i));
            } else if (Animal.allAnimals.get(i).habitat.equals("Enclosure")) {
                enclosureAnimals.add(Animal.allAnimals.get(i));
            } else if (Animal.allAnimals.get(i).habitat.equals("Aviary")) {
                aviaryAnimals.add(Animal.allAnimals.get(i));
            }
        }
    }

    public static void print(ArrayList<Animal> animals) {
        System.out.println("Here are " + animals.size() + " animals: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("  --The end-- \n");
    }
}
