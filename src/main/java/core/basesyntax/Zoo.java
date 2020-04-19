package core.basesyntax;

import java.util.LinkedList;

public class Zoo<T> {
    private static final String AQUARIUM_NAME = "Aquarium";
    private static final String BIRDS_HOME_NAME = "Aviar for birds";
    private static final String CATS_HOME_NAME = "Aviar for cats";

    AnimalsHome aquarium;
    AnimalsHome birdsHome;
    AnimalsHome catsHome;

    public Zoo() {
        this.aquarium = new AnimalsHome<Fish>(AQUARIUM_NAME);
        this.birdsHome = new AnimalsHome<Bird>(BIRDS_HOME_NAME);
        this.catsHome = new AnimalsHome<Cat>(CATS_HOME_NAME);
    }

    <T extends Cat> void addAnimal(T animal) {
        catsHome.animalsList.add(animal);
    }

    <T extends Fish> void addAnimal(T animal) {
        aquarium.animalsList.add(animal);
    }

    <T extends Bird> void addAnimal(T animal) {
        birdsHome.animalsList.add(animal);
    }

    void feedAllAnimal(){
        feedAnimals(aquarium.animalsList);
        feedAnimals(birdsHome.animalsList);
        feedAnimals(catsHome.animalsList);
    }

    void feedAnimals(LinkedList<Animal> list){
        for(Animal animal: list) {
            animal.feed();
        }
    }

    void feedAnimals(LinkedList<Animal> list, String food){
         for(Animal animal: list) {
            animal.feed(food);
        }
    }

    @Override
    public String toString() {
        return "The zoo has aviaries: " +
                aquarium.name +
                ", " + birdsHome.name +
                ", " + catsHome.name +
                "\nIn the \'" + aquarium.name + "\' lives: " + aquarium +
                "\nIn the \'" + birdsHome.name + "\' lives: " + birdsHome +
                "\nIn the \'" + catsHome.name + "\' lives: " + catsHome;
    }
}
