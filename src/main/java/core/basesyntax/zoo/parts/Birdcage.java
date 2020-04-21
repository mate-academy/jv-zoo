package core.basesyntax.zoo.parts;

import core.basesyntax.animals.birds.Bird;
import core.basesyntax.animals.birds.Penguin;
import core.basesyntax.animals.birds.Sparrow;
import java.util.ArrayList;

public class Birdcage {
    private ArrayList<? super Bird> list;

    public Birdcage() {
        list = new ArrayList<>();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
        list.add(sparrow);
        list.add(penguin);
    }

    public ArrayList<? super Bird> getAllAnimal() {
        return list;
    }
}
