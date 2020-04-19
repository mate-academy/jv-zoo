package core.basesyntax;

public class Shark extends Fish {
    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }
}
