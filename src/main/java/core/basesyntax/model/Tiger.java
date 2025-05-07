package core.basesyntax.model;

import core.basesyntax.type.Animal;

public class Tiger extends Animal {
    private String breed;

    public Tiger(String breed, boolean isPredator) {
        super(breed, isPredator);
        this.breed = breed;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return breed;
    }
}
