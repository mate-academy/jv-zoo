package core.basesyntax;

public class Penguin extends Bird implements Swim {
    private static final String FOOD = "fish";

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Penguin" + this.getName() + " is swimming!!");
    }

    @Override
    public String getHabitat() {
        return "land";
    }
    @Override
    public void feed() {
        System.out.println("Penguin " + this.getName() + " is eating " + FOOD);
    }
}
