package core.basesyntax;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    void feed() {
        System.out.println("Tiger is eating. I`m want to eat you!!!");
    }
}
