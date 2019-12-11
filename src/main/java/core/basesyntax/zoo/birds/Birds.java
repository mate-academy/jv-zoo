package core.basesyntax.zoo.birds;

import core.basesyntax.implemantations.FlyAble;
import core.basesyntax.zoo.Animal;

public class Birds extends Animal implements FlyAble {

    @Override
    public void canFly() {
        System.out.println("birds can fly");
    }
}
