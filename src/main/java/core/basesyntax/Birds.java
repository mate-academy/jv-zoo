package core.basesyntax;

public class Birds extends Animal implements Feedable, Moveable, Placeable {
    @Override
    public void addArea() {
        System.out.println("I am bird, I need dome area");
    }

    @Override
    public void moveMe() {
        System.out.println("I am " + this.getClass() + " need to move");
    }

    @Override
    public void feedMe() {
        System.out.println("I am " + this.getClass() + " need to eat");
    }
}
