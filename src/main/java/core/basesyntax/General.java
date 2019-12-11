package core.basesyntax;

public abstract class General extends Animal implements Walkable {
    public General(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking.");
    }
}
