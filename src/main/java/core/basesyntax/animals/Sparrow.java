package core.basesyntax.animals;

import core.basesyntax.exception.HungryAnimalException;

public class Sparrow extends Bird {
    private static final int ENERGY = 70;
    private static final int EXPENDITURE = 20;

    public Sparrow() {
        this.energy = ENERGY;
    }

    @Override
    public void move() throws HungryAnimalException {
        System.out.println("Sparrow is flying and lose energy");
        loseEnergy();
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating and receive energy");
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

    @Override
    void fly() {
        System.out.println("I can fly!!!");
    }
}
