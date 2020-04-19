package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Sparrow sparrow = new Sparrow();
        zoo.birdsAviary.add(sparrow);
        Penguin penguin = new Penguin();
        zoo.birdsAviary.add(penguin);
        Shark shark = new Shark();
        zoo.aquarium.add(shark);
        Tiger tiger = new Tiger();
        zoo.animalsAviary.add(tiger);
        zoo.feedAll();
    }
}
