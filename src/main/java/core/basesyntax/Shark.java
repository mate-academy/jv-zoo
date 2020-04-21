package core.basesyntax;

public class Shark extends Fish implements Swimmable {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a shark");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
