package core.basesyntax.zoo;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void toFeedAnimal(Animal animal) {
        super.toFeedAnimal(this);
    }
}
