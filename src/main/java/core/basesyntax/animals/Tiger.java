package core.basesyntax.animals;

import core.basesyntax.exception.HungryAnimalException;

public class Tiger extends Animal {
    private static final int ENERGY = 200;
    private static final int EXPENDITURE = 100;

    public Tiger() {
        this.energy = ENERGY;
    }

    @Override
    public void move() {
        try {
            loseEnergy();
            System.out.println("Tiger is hunting and lose energy");
        } catch (HungryAnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating and receive energy");
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
