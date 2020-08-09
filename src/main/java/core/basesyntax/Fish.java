package core.basesyntax;

public abstract class Fish extends Animal implements Swimming {

    public Fish(String name, int age, String enclosure) {
        super(name, age, enclosure);
    }

    @Override
    public String getEnclosure() {
        return super.getEnclosure();
    }

    @Override
    public void feed() {

    }

    @Override
    public void goHome() {

    }
}
