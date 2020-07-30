package core.basesyntax;

import core.basesyntax.animals.*;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimmable;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        for (int i = 0; i < 4; i++) {
            zoo.aquarium.addFish(new Shark(i));
            zoo.birdAviary.addBird(new Sparrow(i));
            zoo.birdAviary.addBird(new Penguin(i));
            zoo.mammalsAviary.addMammal(new Tiger(i));
        }

        Zoo.feedAllAnimals();
        Zoo.moveAnimals();
    }
}
