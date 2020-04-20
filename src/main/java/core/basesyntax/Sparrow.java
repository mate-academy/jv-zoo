package core.basesyntax;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow says: \" I believe I can fly...\nWow! I can fly!");
    }
}
