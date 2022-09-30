package core.basesyntax.aviaries;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;
import core.basesyntax.interfaces.Walking;
import java.util.ArrayList;

public class AviaryForLandAnimals extends Aviary {

    public AviaryForLandAnimals() {
        this.animalList = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Walking) {
            this.animalList.add(animal);
        } else {
            System.out.println("This animal can't walk, move it to another aviary");
        }
    }
}
