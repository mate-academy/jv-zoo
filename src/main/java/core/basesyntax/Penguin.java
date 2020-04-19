package core.basesyntax;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void fly() {
        System.out.println("Penguin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}
