package core.basesyntax;

public abstract class Animal {
    protected String name;
    protected boolean hungry = true;

    public Animal(String name) {
        this.name = name;
    }

    boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

    void feed() {
        hungry = false;
    }
}
