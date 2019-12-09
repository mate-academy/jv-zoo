package core.basesyntax;

public abstract class Fish extends Animal implements Swim {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    @Override
    public String getHabitat() {
        return "water";
    }
}
