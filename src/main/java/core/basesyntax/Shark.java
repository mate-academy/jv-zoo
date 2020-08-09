package core.basesyntax;

public class Shark extends Fish implements Swimmable {

    public Shark(Name name, int age) {
        super(name, age);
    }

    @Override
    public String swim() {
        return String.format("Shark with ID%d is swimming", getId());
    }
}
