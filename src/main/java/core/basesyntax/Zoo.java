package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {

    private List<T> birdsAviary = new ArrayList<>();
    private List<T> fishAquarium = new ArrayList<>();
    private List<T> mammalsAviary = new ArrayList<>();

    public void addAnimals(T animal) {
        switch (animal.getClass().getSimpleName()) {
            case "Tiger": mammalsAviary.add(animal);
                break;
            case "Penguin":
            case "Sparrow":
                birdsAviary.add(animal);
                break;
            case "Shark": fishAquarium.add(animal);
                break;
            default:
                break;
        }
    }

    public void feedAnimals(T animal) {
        animal.feedAnimal();
    }

    public void printInfo(T animal) {
        System.out.println(animal);
    }

    public void printBirds() {
        for (Animal animal : birdsAviary) {
            System.out.println(animal.getName());
        }
    }

    public void printMammals() {
        for (Animal animal : mammalsAviary) {
            System.out.println(animal.getName());
        }
    }

    public void printFish() {
        for (Animal animal : fishAquarium) {
            System.out.println(animal.getName());
        }
    }
}
