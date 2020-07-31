package core.basesyntax;

public abstract class Bird extends Animal implements Flying {
    @Override
    public void fly() {
        System.out.println("I can flying");
    }
}
