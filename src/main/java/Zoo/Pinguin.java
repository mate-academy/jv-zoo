package Zoo;

public class Pinguin  extends Birds implements  Swimmable {

    @Override
    public void feed() {
        System.out.println("Pinguin is eating");
    }

    @Override
    public void swim() {

    }
}
