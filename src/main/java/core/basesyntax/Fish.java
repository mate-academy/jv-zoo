package core.basesyntax;

public abstract class Fish extends Animal implements Floating {
    @Override
    public void swim() {
        System.out.println("I can swimming");
    }
}
