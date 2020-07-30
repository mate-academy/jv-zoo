package core.basesyntax.models.animals;

public abstract class Animal {
    public abstract void feed();

    public void doSomething() {
        System.out.printf("%s is chilling now...", this.getClass().getSimpleName());
    }
}
