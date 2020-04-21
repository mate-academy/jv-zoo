package core.basesyntax.cages;

import core.basesyntax.types.Animal;
import core.basesyntax.types.Flyable;
import java.util.ArrayList;
import java.util.List;

public class CageBird extends Zoo {
    private List<Flyable> birdsInCage;

    public CageBird() {
        this.birdsInCage = new ArrayList<>();
    }

    @Override
    public void put(Animal animal) {
        this.birdsInCage.add((Flyable) animal);
    }

    public List<Flyable> getBirdsInCage() {
        return birdsInCage;
    }

    public void setBirdsInCage(List<Flyable> birdsInCage) {
        this.birdsInCage = birdsInCage;
    }

    @Override
    public void feed() {
        for (Flyable flyable : birdsInCage) {
            ((Animal) flyable).eat();
        }
    }
}
