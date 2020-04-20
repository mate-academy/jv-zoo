package core.basesyntax;

public class Shark extends Animal implements Swimmable {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a shark");
    }
}
