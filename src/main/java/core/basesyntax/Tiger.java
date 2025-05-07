package core.basesyntax;

public class Tiger extends Animal implements Actions {
    @Override
    public void feed() {
        System.out.println("The tiger has been fed...");
    }

    @Override
    public void move() {
        System.out.println("The tiger is pacing...");
    }
}
