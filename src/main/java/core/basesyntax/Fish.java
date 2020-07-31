package core.basesyntax;

public abstract class Fish extends Animal implements Floating {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Look at me I'm swimming");
    }
}
