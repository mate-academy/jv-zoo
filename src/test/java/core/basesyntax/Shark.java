package core.basesyntax;

public abstract class Shark extends Animal {

    public Shark(String color, int age) {
        super(color, age);
    }

    @Override
    public void feed() {
        System.out.println("Psss");
    }

    @Override
    public void swim() {
        System.out.println("Pppp");
    }
}
