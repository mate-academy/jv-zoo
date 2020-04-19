package core.basesyntax;

import java.util.LinkedList;

public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Shark shark = new Shark("Shark", 90);
        Penguin penguin = new Penguin("Penguin", 8);
        Sparrow sparrow = new Sparrow("Sparrow", 3);
        Tiger tiger = new Tiger("Tiger", 25);

        zoo.addAnimal(shark);
        zoo.addAnimal(sparrow);
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);

        System.out.println(zoo);    // who are living in zoo

        zoo.feedAllAnimal();

        zoo.feedAnimals(zoo.catsHome.animalsList,"Meal");


    }
}
