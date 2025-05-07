package core.basesyntax.myzoo;

public class Penguin extends Bird implements Swimmable {

    @Override
    public void swim() {
        System.out.println("I swim!\n");
    }

    @Override
    public void fly() {
        System.out.print("I don't fly\n");
    }
}
