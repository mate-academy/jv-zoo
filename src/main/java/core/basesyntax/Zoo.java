package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
    private String name;
    private List<T> cage = new ArrayList<>();
    private List<T> birdCage = new ArrayList<>();
    private List<T> aquarium = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(T animal) {
        moveToCage(animal);
    }

    private void moveToCage(T animal) {
        if (animal instanceof Walkable) {
            cage.add(animal);
        } else if (animal instanceof Flyable) {
            birdCage.add(animal);
        } else {
            aquarium.add(animal);
        }
    }

    public void feedAnimals() {
        System.out.println("Feeding animals in " + name);
        for (Animal animal: cage) {
            animal.feed();
        }
        for (Animal animal: birdCage) {
            animal.feed();
        }
        for (Animal animal: aquarium) {
            animal.feed();
        }
    }
}
