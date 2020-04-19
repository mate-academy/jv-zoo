package core.basesyntax;

import core.basesyntax.abilitiesofanimals.CommonAbilitiesOfAnimals;
import core.basesyntax.classificationbytype.Mammal;

public class Tiger extends Animal implements Mammal, CommonAbilitiesOfAnimals {

    public Tiger(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Tiger is full");
    }
}
