package core.basesyntax.animals;

import core.basesyntax.exception.HungryAnimalException;

public class Shark extends Waterfowl {
    private static final int ENERGY = 70;
    private static final int EXPENDITURE = 70;
    private static final int CALORIES = 70;

    public Shark() {
        this.energy = ENERGY;
    }

    @Override
    public void move() throws HungryAnimalException {
        System.out.println("Shark is swim and lose energy");
        loseEnergy();
    }

    @Override
    public void eat() {
        System.out.println("Shark is eating and receive energy");
        receiveEnergy();
    }

    @Override
    public void loseEnergy() throws HungryAnimalException {
        if (energy < EXPENDITURE) {
            throw new HungryAnimalException("I'm hungry! Feed mi!");
        }
        energy -= EXPENDITURE;
    }

    @Override
    public void receiveEnergy() {
        energy += CALORIES;
    }
}
