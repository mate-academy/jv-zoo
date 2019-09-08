package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Test;
import core.basesyntax.animals.Tiger;
import core.basesyntax.enumerate.AnimalType;
import core.basesyntax.interfaces.Flyable;

public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(AnimalType.SPARROW);
        zoo.addAnimal(AnimalType.TIGER);
        zoo.addAnimal(AnimalType.PENGUIN);
        zoo.addAnimal(AnimalType.SHARK);


        zoo.feedAll();

        Flyable sparrow = new Sparrow();

        Animal tiger = new Tiger();

        zoo.addBird(sparrow);

        Test test = new Test();
        zoo.addBird(test);

    }
}
