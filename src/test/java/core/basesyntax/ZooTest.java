package core.basesyntax;

import core.basesyntax.animals.*;
import org.junit.Test;

/**
 * Feel free to remove this class and create your own.
 */
public class ZooTest {
    @Test
    public void mainTest() {
        Zoo zoo = new Zoo();
        zoo.add(new Shark(20));
        zoo.add(new Penguin(20));
        zoo.add(new Sparrow(20));
        zoo.add(new Tiger(20));

        zoo.watchAllAnimals();
        zoo.watchAllAnimals();
        zoo.watchAllAnimals();
        zoo.feedAllAnimals(150);
        zoo.watchAllAnimals();
        zoo.watchAllAnimals();
        zoo.watchAllAnimals();
    }
}