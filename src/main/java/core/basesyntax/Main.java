package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        zoo.aquarium.add(shark);
        zoo.animalsAviary.add(tiger);
        zoo.birdsAviary.add(sparrow);
        zoo.birdsAviary.add(penguin);
        zoo.feedAll();
    }
}
