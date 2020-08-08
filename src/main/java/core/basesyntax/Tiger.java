package core.basesyntax;

public class Tiger extends Mammal implements Runnable {

    private String subSpecies = "Tiger";

    public Tiger(Name name, int age) {
        super(name, age);
    }

    @Override
    public String run() {
        return String.format("Tiger with ID%d is running", getId());
    }
}
