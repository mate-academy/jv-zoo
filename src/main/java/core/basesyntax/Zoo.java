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

    public void feedAnimals() {
        List<Animal> animals = new ArrayList(cellAnimals);
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void feedBirds() {
        List<Bird> birdsWhoFlying = new ArrayList(cellBirds);
        for (Bird birdWhoFlying : birdsWhoFlying) {
            birdWhoFlying.feed();
        }
    }

    public void feedFish() {
        List<Fish> fish = new ArrayList(cellFish);
        for (Fish fishes : fish) {
            fishes.feed();
        }
    }
}
