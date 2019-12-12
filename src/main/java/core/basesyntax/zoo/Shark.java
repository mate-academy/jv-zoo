package core.basesyntax.zoo;

public class Shark extends Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void feed() {
        System.out.println("I am a "
                + getClass().getSimpleName()
                + " and I would like to eat everybody");
    }
}
