package core.basesyntax.zoo.parts;

import core.basesyntax.animals.fishes.Fish;
import core.basesyntax.animals.fishes.Shark;
import java.util.ArrayList;

public class SwimmingPool {
    private ArrayList<? super Fish> list;

    public SwimmingPool() {
        list = new ArrayList<>();
        Shark shark = new Shark();
        list.add(shark);
    }

    public ArrayList<? extends Fish> getAllAnimal() {
        return (ArrayList<? extends Fish>) list;
    }

    public void putAnimal(Fish fish) {
        list.add(fish);
    }
}
