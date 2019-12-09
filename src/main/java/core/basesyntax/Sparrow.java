package core.basesyntax;

public class Sparrow extends Bird {
    private static final String FOOD = "grain";

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Sparrow " + this.getName() + " is eating " + FOOD);
    }
}
