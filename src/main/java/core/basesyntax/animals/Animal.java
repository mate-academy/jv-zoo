package core.basesyntax.animals;

public abstract class Animal {
    private boolean isHungry = true;

    public void feed() {
        System.out.println("Animal is too abstract");
    }

    public boolean isAnimalHungry() {
        return this.isHungry;
    }
}
