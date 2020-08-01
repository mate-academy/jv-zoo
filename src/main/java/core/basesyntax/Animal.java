package core.basesyntax;

public abstract class Animal {

    private boolean hunger;

    public boolean isHunger() {
        return hunger;
    }

    public abstract void Moving();

    public Animal() {
        int num = (int) (Math.random() + 1);
        hunger = num == 1 ? true : false;
    }
}
