package core.basesyntax;

public class Shark extends Fish {
    private static final String FOOD = "fish";

    public Shark(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Shark " + this.getName() + " is eating " + FOOD);
    }

}
