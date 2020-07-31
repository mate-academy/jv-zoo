package core.basesyntax.animals;

public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Tiger fed");
    }
}
