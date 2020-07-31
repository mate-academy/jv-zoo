package core.basesyntax.animal;

public class Shark extends Fish {
    @Override
    public void feed() {
        System.out.println("Shark is eating.");
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming.");
    }
}
