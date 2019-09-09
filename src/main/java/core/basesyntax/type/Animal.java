package core.basesyntax.type;

public abstract class Animal implements Eating {
    private String breed;
    private boolean isPredator;

    public Animal(String breed, boolean isPredator) {
        this.breed = breed;
        this.isPredator = isPredator;
    }

    @Override
    public void eat() {
        if (isPredator) {
            System.out.println("I like meat!");
        } else {
            System.out.println("I like grass!");
        }
    }
}
