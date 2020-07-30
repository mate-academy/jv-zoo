package core.basesyntax;

public class Sparrow extends Bird implements Actions {
    @Override
    public void feed() {
        System.out.println("The sparrow has been fed...");
    }

    @Override
    public void move() {
        System.out.println("The sparrow is flying...");
    }
}
