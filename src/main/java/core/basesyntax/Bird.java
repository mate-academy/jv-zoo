package core.basesyntax;

public abstract class Bird extends Animal {

    public Bird(String name, int age, String enclosure) {
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
