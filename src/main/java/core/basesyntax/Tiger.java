package core.basesyntax;

public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("The tiger is eating...");
    }
}
