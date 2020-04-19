package core.basesyntax;

public class Shark extends Fish {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    void eat(String s) {
        super.eat(s);
    }

    @Override
    public void swim() {
        System.out.println("Shark can swim!");
    }
}
