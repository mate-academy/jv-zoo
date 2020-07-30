package core.basesyntax;

public class Fish extends Animal implements Feedable, Moveable, Placeable {
    @Override
    public void addArea() {
        System.out.println("I am fish, I need area");
    }

    @Override
    public void moveMe() {
        System.out.println("I am fish, want to swim.");
    }

    @Override
    public void feedMe() {
        System.out.println("I am fish, I am eating...");
    }

}
