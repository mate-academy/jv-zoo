package core.basesyntax;

import core.basesyntax.animals.Bird;
import java.util.ArrayList;
import java.util.List;

public class BirdAviary {
    private final List<Bird> allBirds = new ArrayList<>();

    public Bird addBird(Bird bird) {
        allBirds.add(bird);
        Zoo.getAllAnimals().add(bird);
        return bird;
    }

    public List<Bird> getAllBirds() {
        return allBirds;
    }
}
