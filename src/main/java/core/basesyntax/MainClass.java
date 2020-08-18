package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;

public class MainClass {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addToWaterHabitat(new Shark("Jaws"));
        zoo.addToAirHabitat(new Sparrow("Jack"));
        zoo.addToWaterHabitat(new Penguin("Kovalski"));
        zoo.addToLandHabitat(new Tiger("Tigger"));

        zoo.printAnimals(zoo.getAllAnimals());
        zoo.feedAnimals(zoo.getAllAnimals());
        zoo.allDoSomething();
    }
}
