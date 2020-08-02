package core.basesyntax.animals.fishes;

import core.basesyntax.animals.Fish;
import core.basesyntax.animals.interfaces.Swimmable;

public class Shark extends Fish implements Swimmable {

    public Shark(String type, int age, long id) {
        super(type, age, id);
    }
}
