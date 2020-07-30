package core.basesyntax;

import core.basesyntax.animal.*;

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

    /**
     * Метод для развлечения посетителей.
     * Все рыбы в аквариуме начинают плавать, а птицы,
     * в зависимости от своих способностей, летать или плавать.
     */
    public void entertain() {
        System.out.println();
        fishAviary.getAnimals().forEach(Fish::swim);
        System.out.println();
        birdAviary.getAnimals()
                .forEach(bird -> {
                    if (bird instanceof Flyable) {
                        ((Flyable) bird).fly();
                    }
                    if (bird instanceof Swimmable) {
                        ((Swimmable) bird).swim();
                    }
                });
    }
}
