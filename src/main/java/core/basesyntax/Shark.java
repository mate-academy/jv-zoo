package core.basesyntax;

import core.basesyntax.abilitiesofanimals.CommonAbilitiesOfAnimals;
import core.basesyntax.abilitiesofanimals.SwimAble;
import core.basesyntax.classificationbytype.Fish;

public class Shark extends Animal implements CommonAbilitiesOfAnimals, SwimAble, Fish {
    public Shark(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Shark is full");
    }
}
