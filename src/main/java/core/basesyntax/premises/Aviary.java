package core.basesyntax.premises;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Tiger;
import core.basesyntax.exception.WrongAnimalException;
import java.util.ArrayList;
import java.util.List;

public class Aviary extends Premises {
    List<Animal> aviary = new ArrayList<>();

    @Override
    public void goToPremises(Animal animal) throws WrongAnimalException {
        if (!(animal instanceof Tiger)) {
            throw new WrongAnimalException("Вход рыбам и птицам запрещен запрещен!!!");
        }
        this.aviary.add(animal);
    }

    public String getInmatesCount() {
        return "В вальере " + aviary.size() + " обитателей";
    }
}
