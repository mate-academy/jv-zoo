package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("The sparrow has flown away");
    }

    @Override
    public void feed() {
        System.out.println("The sparrow is eating...");
    }
}
