package core.basesyntax.animals;

public abstract class Animal {
    private boolean isHungry = true;

    public void feed() {
        this.isHungry = false;
    }

    public boolean isAnimalHungry() {
        return this.isHungry;
    }
}
