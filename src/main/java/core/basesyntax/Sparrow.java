package core.basesyntax;

public class Sparrow extends Bird {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    void eat(String s) {
        System.out.println("The sparrow is eating " + s + "!");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly!");
    }
}
