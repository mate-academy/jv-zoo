package core.basesyntax.models;

public class Tiger extends Animal {

    public Tiger() {
        super("Tiger");
    }

    @Override
    public void showAbility() {
        System.out.println(getTypeOfAnimal() + " can hear six times better than human.");
    }
}
