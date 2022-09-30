package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addLandAnimal(new Tiger());
        zoo.addBird(new Sparrow());
        zoo.addBird(new Penguin());
        zoo.addFish(new Shark());

        zoo.feedAnimals();
        zoo.doAction();
    }
}
