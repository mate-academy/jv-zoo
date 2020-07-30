package core.basesyntax;

public class Penguin extends Birds implements Moveable, Feedable, Placeable {
    @Override
    public void addArea() {
        airCage.add(this);
        System.out.println("\nI am penguin, I've been added to aquariumList");
    }

    @Override
    public void moveMe() {
        System.out.println("I am swimming...");
    }

    @Override
    public void feedMe() {
        System.out.println("I am pinguin, I am eating fish...");
    }
}
