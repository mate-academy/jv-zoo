package core.basesyntax;

public class Birds extends Animals {
    public Birds() {
        super();
        this.movingType = MovingType.FLY;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm a bird. I can fly");
    }
}
