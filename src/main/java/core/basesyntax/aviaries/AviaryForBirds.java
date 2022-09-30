package core.basesyntax.aviaries;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;
import core.basesyntax.interfaces.Flyable;

import java.util.ArrayList;

public class AviaryForBirds extends Aviary {
    public AviaryForBirds() {
        this.animalList = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Flyable) {
            this.animalList.add(animal);
        } else {
            System.out.println("This animal can't fly, move it to another aviary");
        }
    }
}
