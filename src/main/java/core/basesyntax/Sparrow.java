package core.basesyntax;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public String toString() {
        return "Sparrow{}";
    }
}
