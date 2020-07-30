package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addBird(new Sparrow());
        zoo.addBird(new Penguin());
        zoo.addFish(new Shark());
        zoo.addLandAnimals(new Tiger());

        zoo.feedAllAnimals();
        System.out.println();
        zoo.behaviorOfAllAnimals();
    }
}
