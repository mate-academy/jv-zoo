package core.basesyntax;

public class Sparrow extends Animal {
    @Override
    public void move() {
        if (isHunger()) {
            System.out.println("Воробей кружится вокруг вас, "
                    + "пытаясь выхватить что-нибудь из корзины");
        } else {
            System.out.println("Воробей купается в пыли. К дождю.");
        }
    }

    @Override
    public void feed() {
        System.out.println("Вот еще, буду я тратить еду на воробьев...");
    }
}
