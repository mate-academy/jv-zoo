package core.basesyntax;

public class Tiger extends Mammal {
    private static final String FOOD = "meat";

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Tiger " + this.getName() + " is eating " + FOOD);
    }
}
