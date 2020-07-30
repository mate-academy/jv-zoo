package core.basesyntax.animals;

import core.basesyntax.exception.HungryAnimalException;

public class Penguin extends Animal {
    private static final int ENERGY = 60;
    private static final int EXPENDITURE = 60;

    public Penguin() {
        this.energy = ENERGY;
    }

    @Override
    public void move() throws HungryAnimalException {
        System.out.println("Penguin is going and lose energy");
        loseEnergy();
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating and receive energy");
        receiveEnergy();
    }

    @Override
    public void loseEnergy() throws HungryAnimalException {
        if (this.energy < EXPENDITURE) {
            throw new HungryAnimalException("I'm hungry! Feed mi!");
        }
        this.energy -= EXPENDITURE;
    }

    @Override
    public void receiveEnergy() {
        this.energy += 50;
    }
}
