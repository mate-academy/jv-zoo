package core.basesyntax;

public class Sparrow implements Flyble extends Sparrow {

    public Sparrow(String color, int age) {
        super(color, age);
    }

    public String getColor() {
        return "Brown";
    }
    public int getAge() {
        return 2;
    }

    @Override
    public void feed() {
        System.out.println("Tick-tick");
    }

    @Override
    public void fly() {

    }
}
