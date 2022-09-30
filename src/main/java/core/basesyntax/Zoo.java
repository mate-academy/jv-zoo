package core.basesyntax;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.aviaries.AviaryForBirds;
import core.basesyntax.aviaries.AviaryForLandAnimals;
import core.basesyntax.aviaries.AviaryForFish;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimable;

public class Zoo {
    private final AviaryForBirds aviaryForBirds;
    private final AviaryForFish aviaryForFish;
    private final AviaryForLandAnimals aviaryForLandAnimals;

    public Zoo() {
        aviaryForBirds = new AviaryForBirds();
        aviaryForFish = new AviaryForFish();
        aviaryForLandAnimals = new AviaryForLandAnimals();
    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Flyable) {
            aviaryForBirds.addAnimal(animal);
        } else if (animal instanceof Swimable) {
            aviaryForFish.addAnimal(animal);
        } else {
            aviaryForLandAnimals.addAnimal(animal);
        }
    }

    public void feedAllAnimals() {
        aviaryForBirds.getAnimalList().forEach(Animal::feed);
        aviaryForFish.getAnimalList().forEach(Animal::feed);
        aviaryForLandAnimals.getAnimalList().forEach(Animal::feed);
    }
}