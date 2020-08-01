package core.basesyntax;

public class Aviary {

    private Animal tiger;
    private Animal penguin;

    public Aviary(Tiger tiger, Penguin penguin) {
        setPenguin(penguin);
        setTiger(tiger);
    }

    public Animal getTiger() {
        return this.tiger;
    }

    public Animal getPenguin() {
        return this.penguin;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public void setPenguin(Penguin penguin) {
        this.penguin = penguin;
    }
}
