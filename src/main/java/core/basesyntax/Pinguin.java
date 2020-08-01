package core.basesyntax;

public class Pinguin extends Animal {

    @Override
    public void move() {
        if (isHunger()) {
            System.out.println("Пингвин, увидев вас, смешно каркая бросается в вашу сторону.");
        } else {
            System.out.println("Пингвин сидит в своем гнезде и не собирается выходить");
        }
    }

    @Override
    public void feed() {
        if (isHunger()) {
            System.out.println("Пингвин ловит на лету мелкую рыбу и сразу глотает");
        }
    }
}
