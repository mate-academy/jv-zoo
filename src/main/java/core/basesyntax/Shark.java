package core.basesyntax;

public class Shark extends Fish {

    public Shark(String name, int age, String enclosure) {
        super(name, age, enclosure);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " sharky is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Some small fishes for " + getName() + " the shark");
    }
}
