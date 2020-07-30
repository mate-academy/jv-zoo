package core.basesyntax;

public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Shark is swimming swimming");
    }

    @Override
    void feed() {
        System.out.println("Shark is eating");
    }
}
