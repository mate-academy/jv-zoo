package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Animal> myZooAnimals = new ArrayList<>();
        myZooAnimals.add(new Tiger("Bobby"));
        myZooAnimals.add(new Shark("Betsy"));
        myZooAnimals.add(new Penguin("Hugo"));
        myZooAnimals.add(new Shark("Lina"));
        myZooAnimals.add(new Tiger("Violet"));
        myZooAnimals.add(new Sparrow("King"));

        Zoo myZoo = new Zoo (myZooAnimals);

        myZoo.feedAnimals();


    }
}
