package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;

public class Main {
    public static void main(String[] args) {
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
