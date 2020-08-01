package core.basesyntax;

public class Tiger extends Animal{
    @Override
    public void Moving() {
        if(isHunger()) {
            System.out.println("Чувствуя запах мяса тигр бежит ко входу в вальер");
        } else {
            System.out.println("Тигр лениво приподнимает морду. По всей видимости он не голоден.");
        }
    }

    @Override
    public void Feeding() {
        if(isHunger()) {
            System.out.println("Тигр хватает кусок мяса и уносит в кусты");
        }
    }
}
