package core.basesyntax;

public class Penguin extends Bird  {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Penguin can not fly but he can swim");
    }
}
