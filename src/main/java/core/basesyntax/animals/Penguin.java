package core.basesyntax.animals;

import core.basesyntax.abilities.SwimmingAble;
import core.basesyntax.abilities.WalkAble;
import core.basesyntax.abstractanimals.Bird;

public class Penguin extends Bird implements WalkAble, SwimmingAble {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void showSpecialAbility() {
        System.out.println(this.getClass().getSimpleName() + " "
                + super.getName()
                + " " + swim()
                + " and"
                + " " + walk());
    }
}
