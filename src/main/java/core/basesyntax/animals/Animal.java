package core.basesyntax.animals;

public abstract class Animal {
    private boolean isHungry = false;

    public void feed() {
        this.isHungry = true;
    }

    public boolean isAnimalHungry() {
        return this.isHungry;
    }
}
