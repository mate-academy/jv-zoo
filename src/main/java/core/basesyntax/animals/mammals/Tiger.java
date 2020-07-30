package core.basesyntax.animals.mammals;

import core.basesyntax.animals.Mammal;
import core.basesyntax.animals.interfaces.IMammal;

public class Tiger extends Mammal implements IMammal {

    public Tiger(String type, int age, long id) {
        super(type, age, id);
    }
}
