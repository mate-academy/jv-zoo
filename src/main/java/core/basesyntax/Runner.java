package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Runner {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal tiger = new Tiger("Kasatik");
        Animal tigerBrother = new Tiger("And I am the brother of the Kasatic");
        Fish shark = new Shark("Hunter");
        Fish sisterShark = new Shark("And i am sister of the Hunter");
        Bird sparrow = new Sparrow("Johnny");
        Bird penguin = new Penguin("Kovalskyi");
        zoo.addAnimal(tiger);
        zoo.addAnimal(tigerBrother);
        zoo.addBird(sparrow);
        zoo.addBird(penguin);
        zoo.addFish(shark);
        zoo.addFish(sisterShark);
        zoo.feedAnimals();
        zoo.feedBirds();
        zoo.feedFishes();
    }
}
