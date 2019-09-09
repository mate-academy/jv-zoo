package core.basesyntax.type;

public abstract class Bird implements Eating {
    private String species;
    private boolean canFly;

    public Bird(String species, boolean canFly) {
        this.species = species;
        this.canFly = canFly;
    }

    @Override
    public void eat() {
        System.out.println("I like grain!");
    }
}
