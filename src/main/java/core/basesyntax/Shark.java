package core.basesyntax;

public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Swimming...");
    }

    @Override
    public void feed() {
        System.out.println("I want fish!");
    }
}
