package core.basesyntax;

public abstract class Tiger extends Animal {

    public Tiger(String color, int age) {
        super(color, age);
    }
    @Override
    public void walk() {
        System.out.println("Jump-jump");
    }

    @Override
    public void feed() {
        System.out.println("Hrrr");
    }
}
