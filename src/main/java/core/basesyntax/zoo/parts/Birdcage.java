package core.basesyntax.zoo.parts;

import core.basesyntax.animals.birds.Bird;
import java.util.ArrayList;

public class Birdcage {
    private ArrayList<? super Bird> list;

    public Birdcage() {
        list = new ArrayList<>();
    }

    public ArrayList<? extends Bird> getAllAnimal() {
        return (ArrayList<? extends Bird>)list;
    }

    public void putAnimal(Bird bird) {
        list.add(bird);
    }
}
