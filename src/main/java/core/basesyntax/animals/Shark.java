package core.basesyntax.animals;

import core.basesyntax.animaltype.Fish;

public class Shark extends Fish {
    private boolean isFed = false;

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("I'm very dangerous swimmer\n");
    }
}
