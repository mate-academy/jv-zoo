package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addBird(new Sparrow("Jack"));
        zoo.addBird(new Penguin("Kovalskiy"));
        zoo.addFish(new Shark("Zubastik"));
        zoo.addLandAnimals(new Tiger("Polosatik"));

        zoo.feedAllAnimals();
        System.out.println();
        zoo.behaviorOfAllAnimals();
    }
}
