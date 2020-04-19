package core.basesyntax;

public abstract class Animal {
    private String nameOfType;

    public Animal(String type) {
        this.nameOfType = type;
    }

    abstract void full();

    @Override
    public String toString() {
        return "Animal" + nameOfType;
    }
}
