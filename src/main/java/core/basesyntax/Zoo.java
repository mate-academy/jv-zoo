package core.basesyntax;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        Penguin penguin1 = new Penguin("Mo-mo", 2, "Aquarium");
        Shark shark1 = new Shark("Paulo", 7, "Aquarium");
        Tiger tiger1 = new Tiger("Diego", 14, "Enclosure");
        Sparrow sparrow1 = new Sparrow("Jack", 1, "Aviary");
        Penguin penguin2 = new Penguin("Kiko", 8, "Aquarium");
        Shark shark2 = new Shark("Dori", 3, "Aquarium");
        Tiger tiger2 = new Tiger("Charla", 4, "Enclosure");
        Sparrow sparrow2 = new Sparrow("Blacky", 3, "Aviary");

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

        print(enclosureAnimals);
        print(aviaryAnimals);
        print(aquariumAnimals);
    }

    public static void print(ArrayList<Animal> animals) {
        System.out.println("Here are " + animals.size() + " animals: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("  --The end-- \n");
    }
}
