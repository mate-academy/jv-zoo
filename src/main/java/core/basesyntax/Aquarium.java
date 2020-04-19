package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Zoo {
    private List<Fish> fishesInAquarium;

    public Aquarium() {
        this.fishesInAquarium = new ArrayList<>();
    }

    @Override
    public void put(Animal animal) {
        this.fishesInAquarium.add((Fish) animal);
    }

    public List<Fish> getFishesInAquarium() {
        return fishesInAquarium;
    }

    public void setFishesInAquarium(List<Fish> fishesInAquarium) {
        this.fishesInAquarium = fishesInAquarium;
    }

    @Override
    public void feed() {
        for (Fish fish : fishesInAquarium) {
            fish.eat();
        }
    }
}
