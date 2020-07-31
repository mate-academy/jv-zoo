package core.basesyntax;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println("I'm eating");
    }
}
