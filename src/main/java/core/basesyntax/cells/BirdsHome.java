package core.basesyntax.cells;

import core.basesyntax.interfaces.Flyable;

import java.util.ArrayList;
import java.util.List;

public class BirdsHome<T extends Flyable> {
    private List<T> birdsHome = new ArrayList<>();

    public void addBird(T f) {
        birdsHome.add(f);
    }

    public void feedBirds() {
        for (T animal : birdsHome) {
            animal.feed();
        }
    }
}
