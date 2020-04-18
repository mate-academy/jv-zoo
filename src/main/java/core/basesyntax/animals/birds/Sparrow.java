package core.basesyntax.animals.birds;

public class Sparrow extends FlyingBird {
    String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Sparrow " + name + " is flying");
    }

    @Override
    public void layEggs() {
        System.out.println("Sparrow " + name + " laid egs");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow " + name + " was fad");
    }
}
