package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class CageBird extends Zoo {
    private List<Bird> birdsInCage;

    public CageBird() {
        this.birdsInCage = new ArrayList<>();
    }

    @Override
    public void put(Animal animal) {
        this.birdsInCage.add((Bird) animal);
    }

    public List<Bird> getBirdsInCage() {
        return birdsInCage;
    }

    public void setBirdsInCage(List<Bird> birdsInCage) {
        this.birdsInCage = birdsInCage;
    }

    @Override
    public void feed() {
        for (Bird bird : birdsInCage) {
            bird.eat();
        }
    }
}
