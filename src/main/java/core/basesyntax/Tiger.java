package core.basesyntax;

public class Tiger extends Mammal {

    public Tiger(String name, int age, String enclosure) {
        super(name, age, enclosure);
    }

    @Override
    public void run() {
        System.out.println("Tiger" + getName() + "runs");
    }

    @Override
    public void feed() {
        System.out.println("Tiger " + getName() + " feeding himself with some tasty meat");
    }
}
