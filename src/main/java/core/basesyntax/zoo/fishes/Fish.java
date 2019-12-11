package core.basesyntax.zoo.fishes;

import core.basesyntax.implemantations.SwimAble;
import core.basesyntax.zoo.Animal;

public class Fish extends Animal implements SwimAble {

    @Override
    public void canSwim() {
        System.out.println("fish can swim");
    }
}
