package core.basesyntax;

public class Animal extends Zoo implements Moveable, Feedable, Placeable {
    @Override
    public void addArea() {
        System.out.println("Animal's have got area.");
    }

    @Override
    public void moveMe() {
        System.out.println("Animal is moving...");
    }

    @Override
    public void feedMe() {
        System.out.println("Animal is eating...");
    }
}
