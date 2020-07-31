package core.basesyntax.animals;

import core.basesyntax.enums.AnimalClass;

public class Animal implements Eating {

    private final AnimalClass animalClass;
    private final Enum genus;

    public Animal(AnimalClass animalClass, Enum genus) {
        this.animalClass = animalClass;
        this.genus = genus;
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public Enum getGenus() {
        return genus;
    }

    @Override
    public void eat() {
        System.out.println("eats...");
    }

    @Override
    public String toString() {
        return "Animal{"
                + "animalClass=" + animalClass
                + ", genus=" + genus
                + '}';
    }
}
