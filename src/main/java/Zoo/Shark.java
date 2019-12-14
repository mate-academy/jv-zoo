package Zoo;

public class Shark extends Fishes implements Swimmable {

    @Override
    public void feed() {
        System.out.println("Shark is eating pinguin");
    }

    @Override
    public void swim() {

    }
}
