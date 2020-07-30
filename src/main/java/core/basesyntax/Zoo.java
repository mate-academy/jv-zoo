package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Bird> cellBirds = new ArrayList<>();
    private List<Fish> cellFishes = new ArrayList<>();
    private List<Animal> cellAnimals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        cellAnimals.add(animal);
    }

    public void addBird(Bird bird) {
        cellBirds.add(bird);
    }

    public void addFish(Fish fish) {
        cellFishes.add(fish);
    }

    public void feedAnimals() {
        List<Animal> animals = new ArrayList(this.cellAnimals);
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void feedBirds() {
        List<Bird> birdsWhoFlying = new ArrayList(this.cellBirds);
        for (Bird birdWhoFlying : birdsWhoFlying) {
            birdWhoFlying.feed();
        }
    }

    public void feedFishes() {
        List<Fish> fishes = new ArrayList(this.cellFishes);
        for (Fish fish : fishes) {
            fish.feed();
        }
    }
}
