package core.basesyntax.zoo.birds;

import core.basesyntax.implemantations.FlyAble;
import core.basesyntax.zoo.Animal;
import core.basesyntax.zoo.CageType;

public class Birds extends Animal implements FlyAble {
    CageType cageType = CageType.CAGE_FOR_BIRDS;

    @Override
    public void canFly() {
        System.out.println("birds can fly");
    }
}
