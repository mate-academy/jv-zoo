package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Runner {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal tiger = new Tiger();
        zoo.addAnimal(tiger);
        tiger.feed();

        Fish shark = new Shark();
        zoo.addFish(shark);
        shark.feed();

        Bird sparrow = new Sparrow();
        zoo.addBird(sparrow);
        sparrow.feed();

        Penguin penguin = new Penguin();
        zoo.addAnimal(penguin);
        penguin.feed();
    }
}
