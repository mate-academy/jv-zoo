package core.basesyntax;

public abstract class Mammal extends Animal implements Walking {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    @Override
    public String getHabitat() {
        return "land";
    }
}
