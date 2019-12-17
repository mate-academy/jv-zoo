package core.basesyntax;

public class Tiger extends Animal implements Predator {
    public Tiger(String name) {
        super(name);
    }

    @Override
    void feed() {
        System.out.println("Is there any meat? Penguins may be? ");
    }
}
