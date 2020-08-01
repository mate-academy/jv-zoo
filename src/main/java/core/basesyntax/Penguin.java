package core.basesyntax;

public class Penguin extends Animal implements Swimmable {
    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming...");
    }
}
