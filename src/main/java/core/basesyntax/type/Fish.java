package core.basesyntax.type;

public abstract class Fish implements Swimming, Eating {
    private String species;
    private boolean isPredator;

    public Fish(String species, boolean isPredator) {
        this.species = species;
        this.isPredator = isPredator;
    }

    @Override
    public void eat() {
        if (isPredator) {
            System.out.println("I like fish!");
        } else {
            System.out.println("I like seaweed!");
        }
    }
}
