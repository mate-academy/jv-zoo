package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<? super Bird> cageBirds = new ArrayList<>();
    private List<? super Fish> cageFishes = new ArrayList<>();
    private List<Animal> cageAnimals = new ArrayList<>();

    public void addBird(Bird bird) {
        cageBirds.add(bird);
    }

    public void addFish(Fish fish) {
        cageFishes.add(fish);
    }

    public void addAnimal(Animal animal) {
        cageAnimals.add(animal);
    }

    public void feedBirds() {
        List<? extends Bird> flyingBirds = new ArrayList(this.cageBirds);
        for (Bird flyingBird : flyingBirds) {
            flyingBird.feed();
        }
    }

    public void feedFishes() {
        List<? extends Fish> fishes = new ArrayList(this.cageFishes);
        for (Fish fish : fishes) {
            fish.feed();
        }
    }

    public void feedAnimals() {
        List<Animal> animals = new ArrayList(this.cageAnimals);
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
