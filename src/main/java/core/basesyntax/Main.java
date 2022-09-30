package core.basesyntax;

import core.basesyntax.animals.Pinguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Pinguin pinguin = new Pinguin("Kovalski", 5);
        Shark shark = new Shark("Jaw", 10);
        Sparrow sparrow = new Sparrow("Captain Jack", 30);
        Tiger tiger = new Tiger("Sherhan", 15);

        zoo.addAnimal(pinguin);
        zoo.addAnimal(shark);
        zoo.addAnimal(sparrow);
        zoo.addAnimal(tiger);

        zoo.feedAllAnimals();
    }
}
