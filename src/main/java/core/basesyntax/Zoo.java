package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.aviaries.BirdsAviary;
import core.basesyntax.aviaries.FishAviary;
import core.basesyntax.aviaries.OtherAnimalsAviary;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimable;

public class Zoo {
    private final BirdsAviary birdsAviary;
    private final FishAviary fishAviary;
    private final OtherAnimalsAviary otherAnimalsAviary;

    public Zoo() {
        birdsAviary = new BirdsAviary();
        fishAviary = new FishAviary();
        otherAnimalsAviary = new OtherAnimalsAviary();
    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Flyable) {
            birdsAviary.addAnimal(animal);
        } else if (animal instanceof Swimable) {
            fishAviary.addAnimal(animal);
        } else {
            otherAnimalsAviary.addAnimal(animal);
        }
    }

    public void feedAllAnimals() {
        birdsAviary.getAnimalList().forEach(Animal::feed);
        fishAviary.getAnimalList().forEach(Animal::feed);
        otherAnimalsAviary.getAnimalList().forEach(Animal::feed);
    }
}


