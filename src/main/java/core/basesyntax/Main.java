package core.basesyntax;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal penguin1 = new Penguin("Mo-mo", 2);
        Animal shark1 = new Shark("Paulo", 7);
        Animal tiger1 = new Tiger("Diego", 14);
        Animal sparrow1 = new Sparrow("Jack", 1);
        Animal penguin2 = new Penguin("Kiko", 8);
        Animal shark2 = new Shark("Dori", 3);
        Animal tiger2 = new Tiger("Charly", 4);
        Animal sparrow2 = new Sparrow("Blacky", 3);

        Zoo.sort();
        print(Zoo.aquariumAnimals);
        print(Zoo.enclosureAnimals);
        print(Zoo.aviaryAnimals);

        Zoo.feed();
    }

    public static void print(List<Animal> animals) {
        System.out.println("Here are " + animals.size() + " animals: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("  --The end-- \n");
    }
}
