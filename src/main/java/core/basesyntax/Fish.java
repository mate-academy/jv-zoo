package core.basesyntax;

public abstract class Fish extends Animal {
    private String generalSpecies = "fishes";

    public Fish(Name name, int age) {
        super(name, age);
    }

    public String getGeneralSpecies() {
        return generalSpecies;
    }
}
