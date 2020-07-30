package core.basesyntax;

import core.basesyntax.animal.Animal;
import core.basesyntax.animal.Bird;
import core.basesyntax.animal.Fish;
import core.basesyntax.animal.LandAnimal;

public class Zoo {
    private Aviary<LandAnimal> landAnimalAviary = new Aviary<>();
    private Aviary<Bird> birdAviary = new Aviary<>();
    private Aviary<Fish> fishAviary = new Aviary<>();

    public Aviary<LandAnimal> getLandAnimalAviary() {
        return landAnimalAviary;
    }

    public Aviary<Bird> getBirdAviary() {
        return birdAviary;
    }

    public Aviary<Fish> getFishAviary() {
        return fishAviary;
    }

    public void feedAllAnimals() {
        landAnimalAviary.getAnimals().forEach(Animal::feed);
        birdAviary.getAnimals().forEach(Animal::feed);
        fishAviary.getAnimals().forEach(Animal::feed);
    }
}
