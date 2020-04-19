package core.basesyntax.models;

public class Bird extends Animal {
    private boolean isFly;

    public Bird(String typeOfAnimal, boolean isFly) {
        super(typeOfAnimal);
        this.isFly = isFly;
    }

    @Override
    public void showAbility() {
        System.out.println(getTypeOfAnimal() + " can " + (isFly ? "fly." : "swim."));
    }
}
