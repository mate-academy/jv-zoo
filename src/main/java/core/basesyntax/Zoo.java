package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
    public List<T> cubicle = new ArrayList<T>();
    public List<T> aquarium = new ArrayList<>();
    public List<T> aviary = new ArrayList<>();
    public List<T> penguineHouse = new ArrayList<>();

    public void addAnimal(T animal) {
        if (animal instanceof Predator && animal instanceof Swimable) {
            aquarium.add(animal);
        } else if (animal instanceof Predator) {
            cubicle.add(animal);
        } else if (animal instanceof Flyable) {
            aviary.add(animal);
        } else {
            penguineHouse.add(animal);
        }
    }

    public void showAllAnimals() {
        System.out.println("In the cubicle there are:");
        for (T animal : cubicle) {
            System.out.println(animal.getName() + " status: " + animal.isHungry());
        }
        System.out.println("In the aquarium there are:");
        for (T animal : aquarium) {
            System.out.println(animal.getName() + " status: " + animal.isHungry());
        }
        System.out.println("In the aviary there are:");
        for (T animal : aviary) {
            System.out.println(animal.getName() + " status: " + animal.isHungry());
        }
        System.out.println("In the penguineHouse there are:");
        for (T animal : penguineHouse) {
            System.out.println(animal.getName() + " status: " + animal.isHungry());
        }
    }

    public void feedAll() {
        for (T animal : cubicle) {
            animal.feed();
        }
        for (T animal : aquarium) {
            animal.feed();
        }
        for (T animal : aviary) {
            animal.feed();
        }
        for (T animal : penguineHouse) {
            animal.feed();
        }
    }
}
