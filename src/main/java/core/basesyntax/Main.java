package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.generics.Fish;
import core.basesyntax.generics.Flyable;
import core.basesyntax.generics.Mammal;

/**
 * Feel free to remove this class and create your own.
 */

public class Main {
    public static void main(String[] args) {
        Mammal<Tiger> tiger = new Tiger();
        tiger.move();
        tiger.feed();

        Flyable<Sparrow> sparrow = new Sparrow();
        sparrow.move();
        sparrow.feed();

        Flyable<Penguin> penguin = new Penguin();
        penguin.move();
        penguin.feed();

        Fish<Shark> shark = new Shark();
        shark.move();
        shark.feed();
    }
}
