package core.basesyntax;

import core.basesyntax.animals.birds.Penguin;
import core.basesyntax.animals.birds.Sparrow;
import core.basesyntax.animals.fishes.Shark;
import core.basesyntax.animals.mammals.Tiger;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addFish(new Shark("white shark", 9, 1));
        zoo.addBird(new Sparrow("usual", 1, 9));
        zoo.addMammal(new Tiger("Indian", 6, 89));

        Penguin penguin = new Penguin("Royal", 5, 3);
        System.out.println(penguin.isFool());
        zoo.addBird(penguin);

        zoo.feed();
        System.out.println(penguin.isFool());
    }
}
