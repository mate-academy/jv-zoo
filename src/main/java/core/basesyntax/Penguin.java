package core.basesyntax;

public class Penguin extends Animal implements Floating {

    @Override
    public void feed() {
        System.out.println("I'm penguin and i'm eating");
    }

    @Override
    public void swim() {
        System.out.println("I'm penguin and i can swim");
    }
}
