package core.basesyntax;

import core.basesyntax.animal.*;
import core.basesyntax.aviaries.AnimalsAviary;
import core.basesyntax.aviaries.Aquarium;
import core.basesyntax.aviaries.BirdsAviary;

public class Main {
    public static void main(String[] args) {
        AnimalsAviary<Animal> terrestrial = new AnimalsAviary<>();
        Aquarium<Animal> underwater = new Aquarium<>();
        BirdsAviary<Animal> aerial = new BirdsAviary<>();

        Animal penguinMother = new Penguin("Elisa", 7, false);
        Animal penguinFather = new Penguin("Bob", 8, false);
        Animal penguinChild = new Penguin("Baby", 1, true);
        for (Animal animal : new Animal[]{penguinChild, penguinFather, penguinMother}) {
            aerial.addToBirdsAviary(animal);
        }

        Animal sharkMother = new Shark("Bloody Mary", 10, true);
        Animal sharkFather = new Shark("Bloody Sam", 10, true);
        Animal sharkChild = new Shark("Hungry George", 3, true);
        for (Animal animal : new Animal[]{sharkChild, sharkFather, sharkMother}) {
            underwater.addToAquarium(animal);
        }

            Animal sparrowMother = new Sparrow("Adele", 3, false);
        Animal sparrowFather = new Sparrow("Sam Smith", 3, false);
        Animal sparrowChild = new Sparrow("Buzova Olha", 1, false);
        for (Animal sparrow : new Animal[]{sparrowChild, sparrowFather, sparrowMother}) {
            aerial.addToBirdsAviary(sparrow);
        }

        Animal tigerMother = new Tiger("Tigritsa", 11, true);
        Animal tigerFather = new Tiger("Nevolk", 10, true);
        Animal tigerChild = new Tiger("Lil Tig", 2, true);
        for (Animal animal : new Animal[]{tigerChild, tigerFather, tigerMother}) {
            terrestrial.addToAnimalAviary(animal);
        }


    }
}
