package core.basesyntax;

public class Shark extends Fish {

    @Override
    public void feed() {
        System.out.println("I'm Shark and i eat meat");
    }

    @Override
    public void swim() {
        System.out.println("I'm Shark and I'm like swimming with people");
    }
}