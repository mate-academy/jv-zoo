package core.basesyntax.animals;

import core.basesyntax.exception.HungryAnimalException;

public abstract class Animal implements IAnimal {
    public int energy;

    public abstract void loseEnergy() throws HungryAnimalException;

    public abstract void receiveEnergy();

    @Override
    public void move() throws HungryAnimalException {
    }
}
