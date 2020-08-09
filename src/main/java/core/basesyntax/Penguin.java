package core.basesyntax;

public class Penguin extends Bird implements Swimming {

    public Penguin(String name, int age, String enclosure) {
        super(name, age, enclosure);
    }

    @Override
    public void swim() {
        System.out.println("Penguin " + getName() + " is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Penguin " + getName() + " is eating");
    }

    @Override
    public void goHome() {
        System.out.println("Penguin, return to your " + getEnclosure() + " !");
    }
}
