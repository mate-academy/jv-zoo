package core.basesyntax;

public class Shark extends Fish implements Moveable, Feedable, Placeable {
    @Override
    public void addArea() {
        aquariumList.add(this);
        System.out.println("\nShark added to aquarium!");
    }

    @Override
    public void feedMe() {
        System.out.println("I am shark. I eating fish...");
    }

    @Override
    public void moveMe() {
        System.out.println("I am chark. I am swimming...");
    }

}
