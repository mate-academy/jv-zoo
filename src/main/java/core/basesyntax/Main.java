package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Animal testTiger = new Tiger();
        Animal testShark = new Shark();
        Animal testSparrow = new Sparrow();
        Animal testPenguin = new Penguin();
        Animal testPenguin2 = new Penguin();

        List<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(testPenguin);
        myAnimals.add(testShark);
        myAnimals.add(testSparrow);
        myAnimals.add(testTiger);
        myAnimals.add(testPenguin2);

        for (Animal a : myAnimals) {
            a.addArea();
            a.feedMe();
            a.moveMe();
        }
        System.out.println("\nBirds in the cage = " + Zoo.airCage.size());
        System.out.println("Predators in the animalCages = " + Zoo.animalCages.size());
        System.out.println("Fihes in the aquarium = " + Zoo.aquariumList.size());
    }
}
