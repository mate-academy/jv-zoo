package core.basesyntax.models;

public class Bird extends Animal {

    public Bird(String typeOfAnimal) {
        super(typeOfAnimal);
    }

    @Override
    public void showAbility() {
        System.out.println(getTypeOfAnimal()
                + " can "
                + (getTypeOfAnimal().equals("Penguin") ? "swim." : "fly."));
    }
}
