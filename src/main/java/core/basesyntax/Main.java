package core.basesyntax;

import core.basesyntax.animals.Pinguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Pinguin pinguin = new Pinguin("Penguin");
        Shark shark = new Shark("Shark");
        Sparrow sparrow = new Sparrow("Sparrow");
        Tiger tiger = new Tiger("Tiger");

        zoo.addAnimal(pinguin);
        zoo.addAnimal(shark);
        zoo.addAnimal(sparrow);
        zoo.addAnimal(tiger);

        zoo.feedAllAnimals();
    }
}