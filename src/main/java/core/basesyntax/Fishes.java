package core.basesyntax;

public class Fishes extends Animals {
    public Fishes() {
        super();
        this.movingType = MovingType.SWEEM;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm a fish. I can swim");
    }
}

