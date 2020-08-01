package core.basesyntax;

public class Tiger extends Animal {
    @Override
    public void move() {
        if (isHunger()) {
            System.out.println("Чувствуя запах мяса тигр бежит ко входу в вальер");
        } else {
            System.out.println("Тигр лениво приподнимает морду. По всей видимости он не голоден.");
        }
    }

    @Override
    public void feed() {
        if (isHunger()) {
            System.out.println("Тигр хватает кусок мяса и уносит в кусты");
        }
    }
}
