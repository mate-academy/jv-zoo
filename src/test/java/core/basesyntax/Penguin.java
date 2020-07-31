package core.basesyntax;

public class Penguin implements Swimmable extends Zoo {


    public Penguin(String color, int age) {
        super(color, age);
    }


    public String getColor() {
        return "Black";
    }
    public int getAge() {
        return 5;
    }

    @Override
    public void feed() {
        System.out.println("Vjyk-vjyk");
    }

    @Override
    public void swim() {

    }
}
