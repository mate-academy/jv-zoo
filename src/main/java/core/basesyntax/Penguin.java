package core.basesyntax;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println(name + " says: \"I believe I can fly...\nShit, I can't fly but swim");
    }
}
