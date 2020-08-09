package core.basesyntax;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(Name name, int age) {
        super(name, age);
    }

    @Override
    public String fly() {
        return String.format("Bird with ID%d is flying", getId());
    }
}
