package core.basesyntax;

public class Sparrow extends Animal implements ToFly {

    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
