package core.basesyntax;

public class Penguin extends Bird implements Swimming {
    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Penguin " + name + " is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Penguin " + name + " is eating");
    }

    @Override
    public void behavior() {
        swim();
    }
}
