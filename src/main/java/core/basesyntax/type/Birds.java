package core.basesyntax.type;

public abstract class Birds {
    private String species;
    private boolean canFly;

    public Birds(String species, boolean canFly) {
        this.species = species;
        this.canFly = canFly;
    }

    public void eat() {
        System.out.println("I like grain!");
    }

    public void fly() {
        if (canFly) {
            System.out.println("I like fly!");
        } else {
            System.out.println("I can't fly!");
        }
    }
}
