package core.basesyntax.animals;

import core.basesyntax.Animal;
import core.basesyntax.animals.interfaces.IMammal;

public class Mammal extends Animal implements IMammal {

    public Mammal(String type, int age, long id) {
        super(type, age, id);
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm a " + super.getType());
    }
}
