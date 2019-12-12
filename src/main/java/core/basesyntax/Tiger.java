package core.basesyntax;

public class Tiger extends Mammal implements Walking {
    private static final String FOOD = "meat";
    private Habitat tigerHabitat = Habitat.LAND;

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Tiger " + this.getName() + " is eating " + FOOD);
    }

    @Override
    public void walk() {
        System.out.println("Tiger " + this.getName() + " is walking");
    }

    @Override
    public Habitat getHabitat() {
        return tigerHabitat;
    }
}
