package core.basesyntax.animals.birds;

public class Swallow extends FlyingBird {
    String name;

    public Swallow(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Swallow " + name + " is flying");
    }

    @Override
    public void layEggs() {
        System.out.println("Swallow " + name + " laid egs");
    }

    @Override
    public void eat() {
        System.out.println("Swallow " + name + " was fad");
    }
}
