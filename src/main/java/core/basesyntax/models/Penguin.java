package core.basesyntax.models;

import core.basesyntax.interfaces.SwimAbility;

public class Penguin extends Bird implements SwimAbility {

    public Penguin() {
        super("Penguin", false);
    }
}
