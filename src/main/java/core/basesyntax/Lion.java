package core.basesyntax;

public class Lion extends Mammal implements Landy {
    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Lion is walking");
    }
}
