package core.basesyntax;

public class Penguin extends Fish implements Swimmable {

    private String subSpecies = "Penguin";

    public Penguin(Name name, int age) {
        super(name, age);
    }

    @Override
    public String swim() {
        return String.format("Penguin with ID%d is swimming", getId());
    }
}
