package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    private static final String FOOD = "grain";
    private Habitat sparrowHabitat = Habitat.AIR;

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Sparrow " + this.getName() + " is eating " + FOOD);
    }

    @Override
    public Habitat getHabitat() {
        return sparrowHabitat;
    }

    @Override
    public void fly() {
        System.out.println("Sparrow " + this.getName() + " is flying!!!");
    }
}
