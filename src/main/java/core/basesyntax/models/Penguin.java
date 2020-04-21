package core.basesyntax.models;

import core.basesyntax.interfaces.FlyAbility;
import core.basesyntax.interfaces.SwimAbility;

public class Penguin extends Bird implements SwimAbility, FlyAbility {

    public Penguin() {
        super("Penguin");
    }
}
