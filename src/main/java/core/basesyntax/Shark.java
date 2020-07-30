package core.basesyntax;

public class Shark extends Fish implements Actions {
    @Override
    public void feed() {
        System.out.println("The shark has been fed...");
    }

    @Override
    public void move() {
        System.out.println("The shark is swimming...");
    }
}
