package core.basesyntax;

public class Anchovy extends Fish{
    public Anchovy(String name, int age) {
        super(name, age);
    }

    @Override
    void eat(String s) {
        System.out.println("There is no food for Anchovy. It is hungry :(");
    }

    @Override
    public void swim() {
        System.out.println("I can swim because I am anchovy!");
    }
}
