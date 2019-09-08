package core.basesyntax.type;

public abstract class Animals {
    private String breed;
    private boolean isPredator;

    public Animals(String breed, boolean isPredator) {
        this.breed = breed;
        this.isPredator = isPredator;
    }

    public void eat() {
        if (isPredator) {
            System.out.println("I like meat!");
        } else {
            System.out.println("I like grass!");
        }
    }
}
