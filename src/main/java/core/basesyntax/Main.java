package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Sparrow("Maks",23));
        zoo.addAnimal(new Tiger("Andy",1));
        zoo.addAnimal(new Sparrow("Fil",5));
        zoo.addAnimal(new Penguin("Kim",2));
        zoo.addAnimal(new Shark("Saul",3));
        zoo.addAnimal(new Penguin("Al", 11));
        zoo.addAnimal(new Penguin("Gus", 11));
        zoo.addAnimal(new Sparrow("Al", 78));
        zoo.addAnimal(new Sparrow("Jack", 31));
        zoo.addAnimal(new Penguin("Fred", 11));
        zoo.addAnimal(new Shark("Kim", 11));
        zoo.addAnimal(new Tiger("Frank", 5));
        zoo.feedAllAnimals();
        zoo.showWhatAnimalsAbleTo();
    }
}
