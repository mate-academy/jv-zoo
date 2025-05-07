package core.basesyntax;

public class Shark extends Animal {
    @Override
    public void move() {
        if (isHunger()) {
            System.out.println("Акула взволнованно нарезает круги по бассейну");
        } else {
            System.out.println("Акулий плавник лениво показывается из "
                    + "под воды и исчезает в глубине. Наверное она не голодна.");
        }
    }

    @Override
    public void feed() {
        System.out.println("Акула выныривает из воды и хватает кусок мяса, упавший в бассейн");
    }
}
