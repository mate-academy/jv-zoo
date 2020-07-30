package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private static List<Animal> animalHouse = new ArrayList<>();
    private static List<Bird> birdHouse = new ArrayList<>();
    private static List<Swimmable> aquarium = new ArrayList<>();

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

    public static void main(String[] args) {
        Animal shark = new Shark();
        Animal tiger = new Tiger();
        Animal penguin = new Penguin();
        Bird sparrow = new Sparrow();

        animalHouse.add(tiger);
        animalHouse.add(shark);
        animalHouse.add(sparrow);
        animalHouse.add(penguin);

        birdHouse.add(sparrow);

        aquarium.add((Swimmable) shark);
        aquarium.add((Swimmable) penguin);

        feedAnimals(animalHouse);
        moveAnimals(animalHouse);

    }
}
