package core.basesyntax;

public class Penguin extends Animal implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a penguin");
    }
}
