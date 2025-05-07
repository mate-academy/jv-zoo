package core.basesyntax;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a penguin");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
