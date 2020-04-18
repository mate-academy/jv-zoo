package core.basesyntax.animals;

import core.basesyntax.abilities.SwimmingAble;
import core.basesyntax.abstractanimals.Bird;

public class Penguin extends Bird implements SwimmingAble {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void showSpecialAbility() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() + " " + swim());
    }
}
