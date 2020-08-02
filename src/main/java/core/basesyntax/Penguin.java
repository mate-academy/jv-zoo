package core.basesyntax;

public class Penguin extends Flyable implements Swimming {

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void act() {
        swim();
    }
}
