package core.basesyntax;

import core.basesyntax.animals.Fish;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<Fish> allFishes = new ArrayList<>();

    public Fish addFish(Fish fish) {
        allFishes.add(fish);
        Zoo.getAllAnimals().add(fish);
        return fish;
    }

    public List<Fish> getAllFishes() {
        return allFishes;
    }
}
