package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animalsInZoo;

    public Zoo() {
        animalsInZoo = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimalsInZoo() {
        return animalsInZoo;
    }

    public <T extends Animal> void setAnimalInZoo(T animal) {
        animalsInZoo.add(animal);
    }

    public <T extends Animal> void feedAnimals(List<T> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
