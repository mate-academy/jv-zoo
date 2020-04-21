package core.basesyntax.cages;

import core.basesyntax.types.Animal;
import java.util.ArrayList;
import java.util.List;

public class CageAnimal extends Zoo {
    private List<Animal> animalsInCage;

    public CageAnimal() {
        this.animalsInCage = new ArrayList<>();
    }

    public List<Animal> getAnimalsInCage() {
        return animalsInCage;
    }

    public void setAnimalsInCage(List<Animal> animalsInCage) {
        this.animalsInCage = animalsInCage;
    }

    @Override
    public void put(Animal animal) {
        this.animalsInCage.add(animal);
    }

    @Override
    public void feed() {
        for (Animal animal : animalsInCage) {
            animal.eat();
        }
    }
}
