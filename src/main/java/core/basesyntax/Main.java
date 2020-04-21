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
        zoo.addAnimal(sparrow);
        zoo.addAnimal(penguin);
        zoo.addAnimal(shark);
        zoo.addAnimal(tiger);
        zoo.feedAll();
    }
}
