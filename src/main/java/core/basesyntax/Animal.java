package core.basesyntax;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void feedAnimal();

    @Override
    public String toString() {
        return "Class: " + getClass().getSimpleName()
                + "\nName: " + getName() + "\n";
    }
}

