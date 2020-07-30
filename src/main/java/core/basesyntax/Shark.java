package core.basesyntax;

public class Shark extends Animal implements Swimmable {
    @Override
    public void feed() {
        System.out.println("The shark is eating...");
    }

    @Override
    public void swim() {
        System.out.println("The shark has swum away");
    }
}
