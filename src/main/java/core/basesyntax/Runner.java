package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Runner {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal tiger = new Tiger("Kasatik");
        System.out.println(tiger.name);
        Fish shark = new Shark("Hunter");
        System.out.println(shark.name);
        Bird sparrow = new Sparrow("Johnny");
        System.out.println(sparrow.name);
        Bird penguin = new Penguin("Kovalskyi");
        System.out.println(penguin.name);
        zoo.addAnimal(tiger);
        zoo.addBird(sparrow);
        zoo.addBird(penguin);
        zoo.addFish(shark);
        zoo.feedAnimals();
        zoo.feedBirds();
        zoo.feedFish();
    }
}
