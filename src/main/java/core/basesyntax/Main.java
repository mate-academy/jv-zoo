package core.basesyntax;

import core.basesyntax.animal.Animal;
import core.basesyntax.animal.Penguin;
import core.basesyntax.animal.Shark;
import core.basesyntax.animal.Sparrow;
import core.basesyntax.animal.Tiger;
import core.basesyntax.aviaries.AnimalsAviary;
import core.basesyntax.aviaries.Aquarium;
import core.basesyntax.aviaries.BirdsAviary;

public class Main {
    public static void main(String[] args) {
        AnimalsAviary<Animal> terrestrial = new AnimalsAviary<>();
        BirdsAviary<Animal> aerial = new BirdsAviary<>();
        System.out.println("----------------ZOO----------------------");
        System.out.println("-------------PENGUINS--------------------");
        Animal penguinMother = new Penguin("Elisa", 7, false);
        Animal penguinFather = new Penguin("Bob", 8, false);
        Penguin penguinChild = new Penguin("Baby", 1, true);
        for (Animal animal : new Animal[]{penguinChild, penguinFather, penguinMother}) {
            aerial.addToBirdsAviary(animal);
        }
        System.out.println("-------LOOK WHAT PENGUIN CAN DO-----------");
        Aquarium<Animal> underwater = new Aquarium<>();
        aerial.removeFromBirdsAviary(penguinChild);
        underwater.addToAquarium(penguinChild);
        penguinChild.swim();

        System.out.println("--------------SHARKS---------------------");
        Animal sharkMother = new Shark("Bloody Mary", 10, true);
        Animal sharkFather = new Shark("Bloody Sam", 10, true);
        Shark sharkChild = new Shark("Hungry George", 3, true);
        for (Animal animal : new Animal[]{sharkChild, sharkFather, sharkMother}) {
            underwater.addToAquarium(animal);
        }
        sharkChild.swim();
        System.out.println("--------------SPARROWS-------------------");
        Animal sparrowMother = new Sparrow("Adele", 3, false);
        Animal sparrowFather = new Sparrow("Sam Smith", 3, false);
        Sparrow sparrowChild = new Sparrow("Buzova Olha", 1, false);
        for (Animal sparrow : new Animal[]{sparrowChild, sparrowFather, sparrowMother}) {
            aerial.addToBirdsAviary(sparrow);
        }
        sparrowChild.fly();
        System.out.println("---------------TIGERS--------------------");
        Animal tigerMother = new Tiger("Tigritsa", 11, true);
        Animal tigerFather = new Tiger("Nevolk", 10, true);
        Animal tigerChild = new Tiger("Lil Tig", 2, true);
        for (Animal animal : new Animal[]{tigerChild, tigerFather, tigerMother}) {
            terrestrial.addToAnimalAviary(animal);
        }
        Zoo zoo = new Zoo();
        zoo.mergeAllAnimals(aerial.getBirdsAviary(),
                terrestrial.getAviary(), underwater.getAquarium());
        System.out.println("-------------FEED ANIMALS----------------");
        zoo.feedAllAnimals();

    }
}
