package core.basesyntax;

public class Penguin extends Birds implements Walkable, Swimmable {

    public Penguin(String name) {
        super(name);
        aviary = aviary.LAND;
    }

    @Override
    public void toSwim() {
        System.out.println("Penguin can swim fast");
    }

    @Override
    public void toWalk() {
        System.out.println("Penguin can walk slowly");
    }

    @Override
    public void toFeed() {
        System.out.println("Penguin is full, thank you");
    }
}
