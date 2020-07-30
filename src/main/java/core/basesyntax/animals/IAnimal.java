package core.basesyntax.animals;

import core.basesyntax.exception.HungryAnimalException;

public interface IAnimal {
    public void move() throws HungryAnimalException;

    public void eat();
}
