package core.basesyntax;

public abstract class Sparrow extends Animal {

    public Sparrow(String color, int age) {
        super(color, age);
    }

    @Override
    public void fly() {
        System.out.println("Pur-pur");
    }

    @Override
    public void feed() {
        System.out.println("Pi-pi");
    }
}

