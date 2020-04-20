package core.basesyntax;

public class Shark extends Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
