package core.basesyntax.animals;

import core.basesyntax.enums.AnimalClass;

public class Animal implements AnimalInterface {

    private final AnimalClass animalClass;
    private final Enum genus;

    private int satiety;

    public Animal(AnimalClass animalClass, Enum genus) {
        this.animalClass = animalClass;
        this.genus = genus;

        satiety = (int) (20 + Math.random() * 81);
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public Enum getGenus() {
        return genus;
    }

    public int getSatiety() {
        return satiety;
    }

    public boolean isSatiety() {
        return satiety == 100;
    }

    @Override
    public void eat(int food) {
        if (satiety > 100) {
            satiety = 100;
        } else {
            satiety += food;
        }
    }

    @Override
    public String toString() {
        return "Класс: " + getAnimalClass() + ", "
                + "род: " + getGenus() + " "
                + "сытость [" + getSatiety() + "/100]";
    }
}
