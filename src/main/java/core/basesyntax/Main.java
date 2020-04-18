package core.basesyntax;

import core.basesyntax.animals.birds.Penguin;
import core.basesyntax.animals.birds.Sparrow;
import core.basesyntax.animals.birds.Swallow;
import core.basesyntax.animals.cats.Tiger;
import core.basesyntax.animals.fishes.Shark;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addFlyingBird(new Sparrow("Bob"));
        zoo.addFlyingBird(new Swallow("Danny"));
        zoo.addFlyingBird(new Sparrow("Lucky"));

        zoo.addFish(new Shark("Lenny"));
        zoo.addFish(new Shark("Kenny"));

        zoo.addPenguin(new Penguin("Kowalski"));
        zoo.addPenguin(new Penguin("Shkiper"));

        zoo.addCat(new Tiger("Rocky"));

        zoo.feedFishes();
        zoo.feedBirds();
        zoo.feedPenguins();
        zoo.feedCats();

        zoo.feedAllAnimals();
    }
}
