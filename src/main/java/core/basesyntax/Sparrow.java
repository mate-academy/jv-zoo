package core.basesyntax;

public class Sparrow extends Birds implements Moveable, Feedable, Placeable {
    @Override
    public void addArea() {
        airCage.add(this);
        System.out.println("\nSparrow added to cages");
    }

    @Override
    public void feedMe() {
        System.out.println("I am sparrow. I am eating grains...");
    }

    @Override
    public void moveMe() {
        System.out.println("I am sparrow, I am flying...");
    }

}
