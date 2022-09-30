package core.basesyntax;

public class Mammases extends Animals {
    public Mammases() {
        super();
        this.movingType = MovingType.WALK;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm a mammase. I can walk");
    }
}
