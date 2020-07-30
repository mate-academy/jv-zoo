package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Bird> aviary = new ArrayList<>();
    private List<Animal> cage = new ArrayList<>();
    private List<Fish> aquarium = new ArrayList<>();

    public void addBird(Bird bird) {
        aviary.add(bird);
        System.out.println("A bird has been added to the aviary at the zoo.\n");
    }

    public void addAnimal(Animal animal) {
        cage.add(animal);
        System.out.println("An animal has been added to the cage at the zoo.\n");
    }

    public void addFish(Fish fish) {
        aquarium.add(fish);
        System.out.println("A fish has been added to the aquarium at the zoo.\n");
    }

    public void feed() {
        for (Animal animal : cage) {
            animal.feed();
        }
        for (Bird bird : aviary) {
            bird.feed();
        }
        for (Fish fish : aquarium) {
            fish.feed();
        }
        System.out.println();
    }

    public void move() {
        for (Animal animal : cage) {
            animal.move();
        }
        for (Bird bird : aviary) {
            bird.move();
        }
        for (Fish fish : aquarium) {
            fish.move();
        }
        System.out.println();
    }
}