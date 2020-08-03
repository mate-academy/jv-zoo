package core.basesyntax;

public abstract class Penguin extends Animal {

    public Penguin(String color, int age) {
        super(color, age);
    }

    @Override
    public void swim() {
        System.out.println("Plyuh-plyuh");
    }

    @Override
    public void feed() {
        System.out.println("Cklyu-Cklyu");
    }
}

