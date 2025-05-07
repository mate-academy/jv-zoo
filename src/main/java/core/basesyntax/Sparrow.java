package core.basesyntax;

public class Sparrow extends Bird implements Flying {
    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println("Sparrow " + name + " is eating");
    }

    @Override
    public void behavior() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Sparrow " + name + " is flying");
    }
}
