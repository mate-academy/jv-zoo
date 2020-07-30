package core.basesyntax;

public class Tiger extends Predators implements Feedable, Moveable, Placeable {
    @Override
    public void addArea() {
        animalCages.add(this);
        System.out.println("\nTiger Added to animalCages");
    }

    @Override
    public void feedMe() {
        System.out.println("I am tiger, I am eating meat...");
    }

    @Override
    public void moveMe() {
        System.out.println("I am tiger, I am runnig...");
    }
}
