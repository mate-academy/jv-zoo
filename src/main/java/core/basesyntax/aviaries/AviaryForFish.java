package core.basesyntax.aviaries;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;
import core.basesyntax.interfaces.Swimable;
import java.util.ArrayList;

public class AviaryForFish extends Aviary {
    public AviaryForFish() {
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
