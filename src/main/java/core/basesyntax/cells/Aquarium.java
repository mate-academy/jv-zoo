package core.basesyntax.cells;

import core.basesyntax.interfaces.Swimable;
import java.util.ArrayList;
import java.util.List;

public class Aquarium<T extends Swimable> {
    private List<T> aquarium = new ArrayList<>();

    public void addWaterfowl(T f) {
        aquarium.add(f);
    }

    public void feedFish() {
        for (T animal : aquarium) {
            animal.feed();
        }
    }
}
