package core.basesyntax;

public class Penguin extends Bird  {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    void eat(String s) {
        System.out.println("The penguin ate " + s + " and he would like to swim.");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can not fly but he can swim");
    }
}
