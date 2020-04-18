package core.basesyntax.animals.fishes;

public class Shark extends Fish {
    String name;

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void swimming() {
        System.out.println("Shark " + name + " is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Shark " + name + " was fed");
    }
}
