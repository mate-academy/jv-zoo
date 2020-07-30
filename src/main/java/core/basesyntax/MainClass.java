package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;

public class MainClass {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addToWaterHabitat(new Shark());
        zoo.addToAirHabitat(new Sparrow());
        zoo.addToWaterHabitat(new Penguin());
        zoo.addToLandHabitat(new Tiger());

        zoo.printAllAnimals();
        zoo.feedAllAnimals();
        zoo.allDoSomething();
    }
}
