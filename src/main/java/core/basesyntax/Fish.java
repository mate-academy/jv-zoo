package core.basesyntax;

public abstract class Fish extends Animal implements Swimming {
    protected Habitat fishHabitat = Habitat.WATTER;

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    @Override
    public Habitat getHabitat() {
        return fishHabitat;
    }
}
