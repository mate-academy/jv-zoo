package core.basesyntax;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Penguin " + this.getName() + " is fed.");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't fly :(");
    }
}
