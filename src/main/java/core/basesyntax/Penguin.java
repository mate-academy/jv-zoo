package core.basesyntax;

public class Penguin extends Animal implements Landy, Swimmable {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Penguin is walking");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
