package core.basesyntax.zoo;

public class Tiger extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I can swim, but not like a fish");
    }

    @Override
    public void feed() {
        System.out.println("I am a "
                + getClass().getSimpleName()
                + " and I would like to eat deer");
    }
}
