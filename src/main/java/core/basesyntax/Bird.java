package core.basesyntax;

public abstract class Bird extends Animal implements Flying {

    public Bird(String name) {
        super(name);
    }

    @Override
    void feed() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is eating");
    }
}
