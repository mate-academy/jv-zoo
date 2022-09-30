package core.basesyntax.premises;

import core.basesyntax.animals.Animal;
import core.basesyntax.exception.WrongAnimalException;

public abstract class Premises {
    public abstract void goToPremises(Animal animal) throws WrongAnimalException;

    public abstract String getInmatesCount() throws WrongAnimalException;
}
