package core.basesyntax;

import java.util.ArrayList;

public class Zoo {
    ArrayList<? super Bird> birdsAviary = new ArrayList<>();
    ArrayList<? super OtherAnimal> animalsAviary = new ArrayList<>();
    ArrayList<? super Fish> aquarium = new ArrayList<>();

    public void feedAll() {
        ArrayList<? extends Bird> birds =
                (ArrayList<? extends Bird>) birdsAviary;
        birds.forEach(Animal::feed);
        ArrayList<? extends OtherAnimal> otherAnimals =
                (ArrayList<? extends OtherAnimal>) animalsAviary;
        otherAnimals.forEach(Animal::feed);
        ArrayList<? extends Fish> fish =
                (ArrayList<? extends Fish>) aquarium;
        fish.forEach(Animal::feed);
    }

    public void addAnimal(Animal...animal) {
        for (Animal thisAnimal : animal) {
            if (Bird.class.isAssignableFrom(thisAnimal.getClass())) {
                birdsAviary.add((Bird) thisAnimal);
            } else if (OtherAnimal.class.isAssignableFrom(thisAnimal.getClass())) {
                animalsAviary.add((OtherAnimal) thisAnimal);
            } else {
                aquarium.add((Fish) thisAnimal);
            }
        }
    }
}
