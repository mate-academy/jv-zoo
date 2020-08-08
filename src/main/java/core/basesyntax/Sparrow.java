package core.basesyntax;

public class Sparrow extends Birds implements Flyable {
    public Sparrow(String name) {
        super(name);
        aviary = aviary.AIR;
    }

    @Override
    public void toFeed() {
        System.out.println("Sparrow is full, thank you");
    }

    @Override
    public void toFly() {
        System.out.println("Sparrow can fly");
    }
}
