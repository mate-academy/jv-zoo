package core.basesyntax.aviaries;

import core.basesyntax.animals.Animal;
import java.util.ArrayList;

public class OtherAnimalsAviary extends Aviary {
    public OtherAnimalsAviary() {
        this.animalList = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        this.animalList.add(animal);
    }
}
