package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Bird> cellBirds = new ArrayList<>();
    private List<Fish> cellFish = new ArrayList<>();
    private List<Animal> cellAnimals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        cellAnimals.add(animal);
    }

    public void addBird(Bird bird) {
        cellBirds.add(bird);
    }

    public void addFish(Fish fish) {
        cellFish.add(fish);
    }
}
