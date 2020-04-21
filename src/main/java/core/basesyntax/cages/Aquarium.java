package core.basesyntax.cages;

import core.basesyntax.types.Animal;
import core.basesyntax.types.Swimmable;
import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Zoo {
    private List<Swimmable> fishesInAquarium;

    public Aquarium() {
        this.fishesInAquarium = new ArrayList<>();
    }

    @Override
    public void put(Animal animal) {
        this.fishesInAquarium.add((Swimmable) animal);
    }

    public List<Swimmable> getFishesInAquarium() {
        return fishesInAquarium;
    }

    public void setFishesInAquarium(List<Swimmable> fishesInAquarium) {
        this.fishesInAquarium = fishesInAquarium;
    }

    @Override
    public void feed() {
        for (Swimmable swimmable : fishesInAquarium) {
            ((Animal) swimmable).eat();
        }
    }
}
