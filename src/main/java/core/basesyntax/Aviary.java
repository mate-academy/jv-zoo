package core.basesyntax;

public class Aviary {

    private Animal tiger = new Tiger();
    private Animal penguin = new Penguin();

    public Animal getTiger() {
        return this.tiger;
    }

    public Animal getPenguin() {
        return this.penguin;
    }

}
