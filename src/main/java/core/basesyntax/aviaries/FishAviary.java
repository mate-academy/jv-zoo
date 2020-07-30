package core.basesyntax.aviaries;

import core.basesyntax.animals.Animal;
import core.basesyntax.interfaces.Swimable;
import java.util.ArrayList;

public class FishAviary extends Aviary {
    public FishAviary() {
        this.animalList = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Swimable) {
            this.animalList.add(animal);
        } else {
            System.out.println("This animal can't swim, move it to another aviary");
        }
    }
}
