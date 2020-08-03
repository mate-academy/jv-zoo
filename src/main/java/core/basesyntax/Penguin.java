package core.basesyntax;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("The penguin has swum away");
    }

    @Override
    public void feed() {
        System.out.println("The penguin is eating...");
    }
}
