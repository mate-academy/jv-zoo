package core.basesyntax;

public class Shark extends Fish implements Swimming {

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println("Shark " + name + " is eating");
    }

    @Override
    public void behavior() {
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Shark " + name + " is swimming");
    }
}
