package core.basesyntax;

public class Penguin extends Bird implements Actions {
    @Override
    public void feed() {
        System.out.println("Penguin has been fed...");
    }

    @Override
    public void move() {
        System.out.println("The penguin is swimming...");
    }
}
