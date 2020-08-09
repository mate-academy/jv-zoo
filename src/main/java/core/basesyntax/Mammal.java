package core.basesyntax;

public abstract class Mammal extends Animal implements Running {

    public Mammal(String name, int age, String enclosure) {
        super(name, age, enclosure);
    }

    @Override
    public void feed() {

    }

    @Override
    public void goHome() {

    }
}
