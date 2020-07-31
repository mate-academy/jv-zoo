package core.basesyntax;

public class Shark implements Swimmable extends Zoo {

    public Shark(String color, int age) {
        super(color, age);
    }

    public String getColor() {
        return "White";
    }
    public int getAge() {
        return 1;
    }

    @Override
    public void feed() {
        System.out.println("Plyuhhh");
    }

    @Override
    public void swim() {

    }
}

