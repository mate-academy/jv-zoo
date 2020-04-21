package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Bird;
import core.basesyntax.animals.Fish;
import core.basesyntax.animals.Predator;

public class Zoo {
    private Aviary<Fish> aquarium;
    private Aviary<Predator> aviary;
    private Aviary<Bird> birdcage;

    public Zoo() {
        aquarium = new Aviary<>("Aquarium");
        aviary = new Aviary<>("Aviary");
        birdcage = new Aviary<>("Birdcage");
    }

    public void feedAllAnimals(int foodAmount) {
        int foodPerAnimal = foodAmount
                / totalNumberOfAnimals(aquarium, aviary, birdcage);
        feedAviary(aquarium, foodPerAnimal);
        feedAviary(aviary, foodPerAnimal);
        feedAviary(birdcage, foodPerAnimal);
    }

    public void watchAllAnimals() {
        watchAviary(aquarium);
        watchAviary(aviary);
        watchAviary(birdcage);
    }

    public void add(Bird bird) {
        birdcage.addAnimal(bird);
    }

    public void add(Fish fish) {
        aquarium.addAnimal(fish);
    }

    public void add(Predator predator) {
        aviary.addAnimal(predator);
    }

    public boolean add(Animal animal) {
        if (animal instanceof Fish) {
            add((Fish) animal);
            return true;
        }
        if (animal instanceof Bird) {
            add((Bird) animal);
            return true;
        }
        if (animal instanceof Predator) {
            add((Predator) animal);
            return true;
        }
        return false;
    }

    private void feedAviary(Aviary<? extends Animal> aviary, int foodPerAnimal) {
        for (Animal animal : aviary.getAnimals()) {
            animal.feed(foodPerAnimal);
        }
    }

    private void watchAviary(Aviary<? extends Animal> aviary) {
        for (Animal animal : aviary.getAnimals()) {
            int highLevel = animal.move();
            if (highLevel == 0) {
                System.out.format("%s is tired\n", animal);
            } else {
                System.out.format("%s is %d meters high\n", animal, highLevel);
            }
        }
    }

    private int totalNumberOfAnimals(Aviary... aviaries) {
        int sum = 0;
        for (Aviary aviary : aviaries) {
            sum += aviary.getNumberOfAnimals();
        }
        return sum;
    }
}
