package core.basesyntax;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a tiger");
    }
}
