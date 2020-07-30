package core.basesyntax;

public class Predators extends Animal implements Feedable, Moveable, Placeable {
    @Override
    public void addArea() {
        System.out.println("I am predator I dont have where to live");
    }

    @Override
    public void moveMe() {
        System.out.println("I am predator, I have to move");
    }

    @Override
    public void feedMe() {
        System.out.println("I am predator, I need food");
    }
}
