package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private List<Animal> cage = new ArrayList<>();
    private List<Animal> birdCage = new ArrayList<>();
    private List<Animal> aquarium = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        moveToCage(animal);
    }

    private void moveToCage(Animal animal) {
        if (animal instanceof General) {
            cage.add(animal);
        } else if (animal instanceof Bird) {
            birdCage.add(animal);
        } else {
            aquarium.add(animal);
        }
    }

    public void feedAnimals() {
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
