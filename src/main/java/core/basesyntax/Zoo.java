package core.basesyntax;

import core.basesyntax.animal.Animal;
import core.basesyntax.animal.Bird;
import core.basesyntax.animal.Flyable;
import core.basesyntax.animal.LandAnimal;
import core.basesyntax.animal.Swimmable;

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
     * Вольер для плавающих (аквариум)
     */
    private final Aviary<Swimmable> aquarium = new Aviary<>();

    public Aviary<LandAnimal> getLandAnimalAviary() {
        return landAnimalAviary;
    }

    public Aviary<Bird> getBirdAviary() {
        return birdAviary;
    }

    public Aviary<Swimmable> getAquarium() {
        return aquarium;
    }

    /**
     * Метод реализует логику кормления всех животных зоопарка
     */
    public void feedAllAnimals() {
        landAnimalAviary.getAnimals().forEach(Animal::feed);
        birdAviary.getAnimals().forEach(Animal::feed);
        aquarium.getAnimals().forEach(swimmable -> ((Animal) swimmable).feed());
    }

    /**
     * Метод для развлечения посетителей.
     * Все рыбы в аквариуме начинают плавать, а птицы,
     * в зависимости от своих способностей, летать или плавать.
     */
    public void entertain() {
        System.out.println();
        aquarium.getAnimals().forEach(Swimmable::swim);
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
