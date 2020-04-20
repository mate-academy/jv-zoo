package core.basesyntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        catsHome.animalHashMap.put(animal.name, animal);
    }

    <T extends Fish> void addAnimal(T animal) {
        aquarium.animalHashMap.put(animal.name, animal);
    }

    <T extends Bird> void addAnimal(T animal) {
        birdsHome.animalHashMap.put(animal.name, animal);
    }

    private void feedAnimals(HashMap<String, Animal> animalsList) {
        animalsList.entrySet().stream()
                .forEach(a -> a.getValue().feed());
    }

    void feedAllAnimal() {
        feedAnimals(aquarium.animalHashMap);
        feedAnimals(birdsHome.animalHashMap);
        feedAnimals(catsHome.animalHashMap);
    }

    void feedAnimalByName(String animalName, String food) {

        // Need refactor with streams

        ArrayList<AnimalsHome> animalsHomeArrayList = new ArrayList<>();
        animalsHomeArrayList.add(aquarium);
        animalsHomeArrayList.add(birdsHome);
        animalsHomeArrayList.add(catsHome);

        animalsHomeArrayList.stream()
                .map(animalsHome -> animalsHome.animalHashMap.entrySet())
                .filter(o -> o.
                .flatMap(animalsHomeArrayList -> animalsHomeArrayList.)
                .forEach(e -> e.);

        for (AnimalsHome a : animalsHomeArrayList) {
            HashMap<String, Animal> animalHashMap = a.animalHashMap;
            for (Map.Entry<String, Animal> m : animalHashMap.entrySet()) {
                if (m.getValue().name.equals(animalName)) {
                    m.getValue().feed(food);
                    return;
                }
            }
        }
        System.out.println("There is no animal with name " + animalName + " in Zoo!");
    }

//    void goAnimalsFly(){
//        HashMap<String, Animal> animalsList = birdsHome.animalHashMap;
//        for (Map.Entry<String, Animal> m : animalsList.entrySet()) {
//            m.getValue()
//        }
//    }

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
