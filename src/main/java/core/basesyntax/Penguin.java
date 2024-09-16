package core.basesyntax;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("I'm a weird Bird, wanna be feeded");
    }

    @Override
    public void swim() {
        System.out.println("Swimming bird");
    }
}
