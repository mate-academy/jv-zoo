package core.basesyntax.zoo;

public class Shark extends Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void toFeedAnimal(Animal animal) {
        super.toFeedAnimal(this);
    }
}
