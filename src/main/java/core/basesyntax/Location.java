package core.basesyntax;

import java.util.ArrayList;

public class Location {

    public enum Locations {
        BIRDSAVIARY,
        MAMMALSAVIARY,
        GENERALSAVIARY,
        AQUARIUM;
    }

    private Locations location;

    private ArrayList<Animal> animalsInLocation = new ArrayList<Animal>();

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
                break;
            case GENERALSAVIARY:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 4 + 1);
                    switch (animalType) {
                        case 1:
                            addAnimal(new Tiger());
                            break;
                        case 2:
                            addAnimal(new Sparrow());
                            break;
                        case 3:
                            addAnimal(new Pinguin());
                            break;
                        default:
                            break;
                    }
                }
                break;
            case BIRDSAVIARY:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 2 + 1);
                    if (animalType == 1) {
                        addAnimal(new Sparrow());
                    } else {
                        addAnimal(new Pinguin());
                    }
                }
                break;
            case MAMMALSAVIARY:
                for (int i = 1; i <= animalsNumber; i++) {
                    int animalType = (int) (Math.random() * 2 + 1);
                    if (animalType == 1) {
                        addAnimal(new Sparrow());
                    } else {
                        addAnimal(new Tiger());
                    }
                }
                break;
            default:
                break;
        }
    }

    private void addAnimal(Animal animal) {
        animalsInLocation.add(animal);
    }

    public Locations getLocation() {
        return location;
    }

    public ArrayList<Animal> getAnimalsInLocation() {
        return animalsInLocation;
    }

    public void feederComing() {
        animalsInLocation.forEach(Animal::move);
    }

    public void feed() {
        animalsInLocation.forEach(Animal::feed);
    }
}
