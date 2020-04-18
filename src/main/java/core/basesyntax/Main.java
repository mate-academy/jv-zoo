package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(List.of(
                new Shark("Alena", 25),
                new Tiger("Valera", 1),
                new Sparrow("Jack", 31),
                new Penguin("Fred", 11),
                new Shark("Kim", 11),
                new Tiger("Frank", 5),
                new Sparrow("Al", 78),
                new Penguin("Gus", 11),
                new Penguin("Al", 11)));
        zoo.feedAllAnimals();
        zoo.showWhatAnimalsAbleTo();
    }
}
