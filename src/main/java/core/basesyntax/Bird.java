package core.basesyntax;

public abstract class Bird extends Animal {

    private String generalSpecies = "birds";

    public Bird(Name name, int age) {
        super(name, age);
    }

    public String getGeneralSpecies() {
        return generalSpecies;
    }
}
