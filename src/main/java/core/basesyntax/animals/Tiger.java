package core.basesyntax.animals;

import core.basesyntax.abilities.WalkAble;
import core.basesyntax.abstractanimals.LandAnimal;

public class Tiger extends LandAnimal implements WalkAble {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void showSpecialAbility() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() + " " + walk());
    }
}
