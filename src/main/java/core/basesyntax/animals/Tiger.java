package core.basesyntax.animals;

import core.basesyntax.animaltype.OtherAnimals;

public class Tiger extends OtherAnimals {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("I can only walk :(\n");
    }
}
