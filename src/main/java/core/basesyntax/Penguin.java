package core.basesyntax;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
