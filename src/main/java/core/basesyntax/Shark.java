package core.basesyntax;

import core.basesyntax.abilitiesOfAnimals.CommonAbilitiesOfAnimals;
import core.basesyntax.abilitiesOfAnimals.SwimAble;
import core.basesyntax.classificationByType.Fish;

public class Shark extends Animal implements CommonAbilitiesOfAnimals, SwimAble, Fish {
    public Shark(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Shark is full");
    }
}
