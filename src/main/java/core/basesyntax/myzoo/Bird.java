package core.basesyntax.myzoo;

public abstract class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("I fly!\n");
    }
}
