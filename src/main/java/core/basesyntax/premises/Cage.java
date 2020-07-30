package core.basesyntax.premises;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.exception.WrongAnimalException;

import java.util.ArrayList;
import java.util.List;

public class Cage extends Premises {
    List<Animal> cage = new ArrayList<>();

    @Override
    public void goToPremises(Animal animal) throws WrongAnimalException {
        if (!(animal instanceof Sparrow) || !(animal instanceof Penguin)) {
            throw new WrongAnimalException("Only for birds!!!");
        }
        this.cage.add(animal);
    }
    public String getInmatesCount() {
        return "В клетке " + cage.size() + " обитателей";
    }
}
