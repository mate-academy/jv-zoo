package core.basesyntax;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void feed();

    public abstract String getHabitat();
}
