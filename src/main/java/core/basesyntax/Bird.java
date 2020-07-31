package core.basesyntax;

public abstract class Bird extends Animal implements Flying {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
