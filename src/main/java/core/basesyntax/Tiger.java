package core.basesyntax;

import core.basesyntax.abilitiesOfAnimals.CommonAbilitiesOfAnimals;
import core.basesyntax.classificationByType.Mammal;

public class Tiger extends Animal implements Mammal, CommonAbilitiesOfAnimals {


    public Tiger(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Tiger is full");
    }
}
