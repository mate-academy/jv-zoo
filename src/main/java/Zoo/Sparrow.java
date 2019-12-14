package Zoo;

public class Sparrow extends Birds implements Flyable{

    @Override
    public void feed() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {

    }
}
