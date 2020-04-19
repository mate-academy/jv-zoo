package core.basesyntax;

public class Sparrow extends Bird {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly!");
    }
}
