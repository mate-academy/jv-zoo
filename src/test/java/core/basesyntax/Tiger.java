package core.basesyntax;

public class Tiger extends Zoo {

    public Tiger(String color, int age) {
        super(color, age);
    }

    public String getColor() {
        return "Orange and White";
    }
    public int getAge() {
        return 10;
    }

    @Override
    public void feed() {
        System.out.println("Hhrrmmm");
    }
}
