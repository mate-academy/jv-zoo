package core.basesyntax;

import core.basesyntax.animal.Animal;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zoo = new ArrayList<>();

    public void mergeAllAnimals(ArrayList<Animal> terrestrial,
                                ArrayList<Animal> underwater, ArrayList<Animal> aerial) {
        zoo.addAll(terrestrial);
        zoo.addAll(underwater);
        zoo.addAll(aerial);
    }

    public void feedAllAnimals() {
        for (Animal animal : zoo) {
            animal.feed();
        }
    }
}
