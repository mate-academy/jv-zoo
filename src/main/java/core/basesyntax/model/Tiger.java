package core.basesyntax.model;

import core.basesyntax.type.Animals;

public class Tiger extends Animals {
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
