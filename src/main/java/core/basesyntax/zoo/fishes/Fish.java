package core.basesyntax.zoo.fishes;

import core.basesyntax.implemantations.SwimAble;
import core.basesyntax.zoo.Animal;
import core.basesyntax.zoo.CageType;

public class Fish extends Animal implements SwimAble {

    CageType cageType = CageType.AQUARIUM;

    @Override
    public void canSwim() {
        System.out.println("fish can swim");
    }
}
