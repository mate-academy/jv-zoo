package core.basesyntax.type;

public abstract class Fishes implements Swimming {
    private String species;
    private boolean isPredator;

    public Fishes(String species, boolean isPredator) {
        this.species = species;
        this.isPredator = isPredator;
    }

    public void eat() {
        if (isPredator) {
            System.out.println("I like fish!");
        } else {
            System.out.println("I like seaweed!");
        }
    }
}
