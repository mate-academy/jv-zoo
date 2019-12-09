package core.basesyntax.myzoo;

public abstract class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I swim!\n");
    }
}
