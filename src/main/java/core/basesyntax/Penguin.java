package core.basesyntax;

public class Penguin extends Bird implements Swimming{
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void behavior() {
        swim();
    }
}
