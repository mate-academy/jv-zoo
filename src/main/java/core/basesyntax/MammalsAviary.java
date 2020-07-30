package core.basesyntax;

import core.basesyntax.animals.Bird;
import core.basesyntax.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class MammalsAviary {
    private final List<Mammal> allMammals = new ArrayList<>();

    public Mammal addMammal(Mammal mammal) {
        allMammals.add(mammal);
        Zoo.getAllAnimals().add(mammal);
        return mammal;
    }

    public List<Mammal> getAllMammals() {
        return allMammals;
    }
}
