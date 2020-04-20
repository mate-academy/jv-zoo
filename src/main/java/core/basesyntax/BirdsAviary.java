package core.basesyntax;

import java.util.ArrayList;

public class BirdsAviary {
    private ArrayList<Flyable> birdsAviary;

    public BirdsAviary() {
        birdsAviary = new ArrayList<>();
    }

    public void add(Flyable animal){
        birdsAviary.add(animal);
    }
}
