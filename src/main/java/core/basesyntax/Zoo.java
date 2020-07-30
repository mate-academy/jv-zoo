package core.basesyntax;

import core.basesyntax.animal.Animal;
import core.basesyntax.animal.Bird;
import core.basesyntax.animal.Fish;
import core.basesyntax.animal.LandAnimal;

public class Zoo {
    /**
     * Вольер для сухопутных животных
     */
    private final Aviary<LandAnimal> landAnimalAviary = new Aviary<>();
    /**
     * Вольер для птиц
     */
    private final Aviary<Bird> birdAviary = new Aviary<>();
    /**
     * Вольер для рыб (аквариум)
     */
    private final Aviary<Fish> fishAviary = new Aviary<>();

    public Aviary<LandAnimal> getLandAnimalAviary() {
        return landAnimalAviary;
    }

    public Aviary<Bird> getBirdAviary() {
        return birdAviary;
    }

    public Aviary<Fish> getFishAviary() {
        return fishAviary;
    }

    /**
     * Метод реализует логику кормления всех животных зоопарка
     */
    public void feedAllAnimals() {
        landAnimalAviary.getAnimals().forEach(Animal::feed);
        birdAviary.getAnimals().forEach(Animal::feed);
        fishAviary.getAnimals().forEach(Animal::feed);
    }
}
