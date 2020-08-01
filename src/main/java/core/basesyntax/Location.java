package core.basesyntax;

import java.util.ArrayList;
import java.util.concurrent.atomic.LongAccumulator;

public class Location {

    public enum Locations {
        BIRDSAVIARY,
        MAMMALSAVIARY,
        GENERALSAVIARY,
        AQUARIUM;
    }

    public Location(Locations location) {
        this.location = location;
        int animalsNumber = (int) (Math.random() * 10 + 1);
        switch (location) {
            case AQUARIUM:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 2 + 1);
                    if (animalType == 1) {
                        addAnimal(new Shark());
                    } else {
                        addAnimal(new Pinguin());
                    }
                }
            case GENERALSAVIARY:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 4 + 1);
                    switch (animalType) {
                        case 1:
                            addAnimal(new Tiger());
                        case 2:
                            addAnimal(new Sparrow());
                        case 3:
                            addAnimal(new Pinguin());
                    }
                }
            case BIRDSAVIARY:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 2 + 1);
                    if (animalType == 1) {
                        addAnimal(new Sparrow());
                    } else {
                        addAnimal(new Pinguin());
                    }
                }
            case MAMMALSAVIARY:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 2 + 1);
                    if (animalType == 1) {
                        addAnimal(new Sparrow());
                    } else {
                        addAnimal(new Tiger());
                    }
                }
        }
    }

    private Locations location;

    private ArrayList<Animal> animalsInLocation;

    private void addAnimal(Animal animal) {
        animalsInLocation.add(animal);
    }

    public Locations getLocation() {
        return location;
    }

    public ArrayList<Animal> getAnimalsInLocation() {
        return animalsInLocation;
    }
}
