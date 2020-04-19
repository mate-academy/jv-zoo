package core.basesyntax;

public class Tiger extends Cat {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    void eat(String s) {
        System.out.println("The tiger ate " + s + " and the penguin while he ran from the BirdsHome to the Aquarium to swim.");
    }
}
