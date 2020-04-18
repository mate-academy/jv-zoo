package core.basesyntax;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("I'm a weird Bird, wanna be feeded");
    }
}
