package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addBird(new Penguin());
        zoo.addBird(new Sparrow());
        zoo.addAnimal(new Tiger());
        zoo.addFish(new Shark());

        zoo.feed();
        zoo.move();
    }
}
