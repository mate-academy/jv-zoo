package core.basesyntax;

public class Sparrow extends Bird implements Flying {

    public Sparrow(String name, int age, String enclosure) {
        super(name, age, enclosure);
    }

    @Override
    public void fly() {
        System.out.println("Fly little sparrow " + getName());
    }

    @Override
    public void feed() {
        System.out.println("Sparrow " + getName() + " is eating");
    }

    @Override
    public void goHome() {
        System.out.println("Time to go to " + getEnclosure());
    }
}
