package core.basesyntax;

import core.basesyntax.animals.*;

public class Zoo {
    private Aviary<Fish> aquarium;
    private Aviary<Animal> commonAviary;
    private Aviary<Bird> birdAviary;

    public Zoo() {
        aquarium = new Aviary<>("Aquarium");
        commonAviary = new Aviary<>("Aviary");
        birdAviary = new Aviary<>("Birdcage");
    }

    public void feedAllAnimals(int foodAmount) {
        int foodPerAnimal = foodAmount /
                totalNumberOfAnimals(aquarium, commonAviary, birdAviary);
        feedAviary(aquarium, foodPerAnimal);
        feedAviary(commonAviary, foodPerAnimal);
        feedAviary(birdAviary, foodPerAnimal);
    }

    public void watchAllAnimals() {
        watchAviary(aquarium);
        watchAviary(commonAviary);
        watchAviary(birdAviary);
    }

    public void add(Bird bird) {
        birdAviary.addAnimal(bird);
    }

    public void add(Fish fish) {
        aquarium.addAnimal(fish);
    }

    public void add(Animal animal) {
        commonAviary.addAnimal(animal);
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
