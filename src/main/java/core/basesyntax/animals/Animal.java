package core.basesyntax.animals;

public abstract class Animal {
    private boolean isHungry = false;

    public void feed() {
        isHungry = true;
    }
}
