package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private static List<Animal> animalHouse = new ArrayList<>();
    private static List<Bird> birdHouse = new ArrayList<>();
    private static List<Swimmable> aquarium = new ArrayList<>();

    public static void addAnimal(Animal animal) {
        animalHouse.add(animal);
    }

    public static void addBird(Bird bird) {
        animalHouse.add(bird);
    }

    public static void addSwimmable(Swimmable swimmable) {
        animalHouse.add((Animal) swimmable);
    }

    public static List<Animal> getAnimalHouse() {
        return animalHouse;
    }

    public static List<Bird> getBirdHouse() {
        return birdHouse;
    }

    public static List<Swimmable> getAquarium() {
        return aquarium;
    }

    public static void feedAnimals(List listOfAnimals) {
        for (Object animal: listOfAnimals) {
            if (animal instanceof Animal) {
                ((Animal) animal).feed();
            } else {
                System.out.println("Your house isn't an animal house");
                break;
            }
        }
    }

    public static void moveAnimals(List listOfAnimals) {
        for (Object animal: listOfAnimals) {
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
        }
    }

}
