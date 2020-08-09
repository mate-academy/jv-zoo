package core.basesyntax;

public abstract class Mammal extends Animal {

    private String generalSpecies = "mammals";

    public Mammal(Name name, int age) {
        super(name, age);
    }

    public String getGeneralSpecies() {
        return generalSpecies;
    }
}
