package core.basesyntax.premises;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Waterfowl;
import core.basesyntax.exception.WrongAnimalException;
import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Premises {
    List<Animal> aquarium = new ArrayList<>();

    @Override
    public void goToPremises(Animal animal) throws WrongAnimalException {
        if (!(animal instanceof Waterfowl)) {
            throw new WrongAnimalException("Вход неводоплавающим запрещен!!!");
        }
        aquarium.add(animal);
    }

    public String getInmatesCount() {
        return "В аквариуме " + aquarium.size() + " обитателей";
    }
}
