package core.basesyntax;

public class Shark extends Fish implements Swimming {

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Shark is eating");
    }

    @Override
    public void act() {
        swim();
    }


}
