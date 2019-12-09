package core.basesyntax.zoo;

public abstract class Animal implements Feedable {
    protected String name;

    @Override
    public void toFeedAnimal(Animal animal) {
        System.out.println("Hello, "
                + animal.getClass().getSimpleName()
                + ". It is time for eating.");
    }
}
