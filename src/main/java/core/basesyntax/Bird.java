package core.basesyntax;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("The bird is eating...");
    }
}
