package core.basesyntax;

public class Penguin extends Bird implements Swimming, Walking {
    private static final String FOOD = "fish";

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Penguin" + this.getName() + " is swimming!!");
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.LAND;
    }

    @Override
    public void walk() {
        System.out.println("Penguin" + this.getName() + " is walking!!");
    }

    @Override
    public void feed() {
        System.out.println("Penguin " + this.getName() + " is eating " + FOOD);
    }
}
