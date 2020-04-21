package core.basesyntax.animals;

import core.basesyntax.abilities.SwimmingAble;
import core.basesyntax.abstractanimals.Fish;

public class Shark extends Fish implements SwimmingAble {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void showSpecialAbility() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() + " " + swim());
    }
}
