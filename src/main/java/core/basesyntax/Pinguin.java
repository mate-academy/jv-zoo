package core.basesyntax;

public class Pinguin extends Animal {

    @Override
    public void Moving() {
        if (isHunger()) {
            System.out.println("Пингвин, едва завидев вас, с смешным клекотом бросается в вашу сторону.");
        } else {
            System.out.println("Пингвин сидит в своем гнезде и не собирается выходить");
        }
    }

    @Override
    public void Feeding() {
        if (isHunger()) {
            System.out.println("Пингвин ловит на лету мелкую рыбу и сразу глотает");
        }
    }
}
