package core.basesyntax;

public class Aquarium {

    private Animal shark;

    public Aquarium(Shark shark) {
        setShark(shark);
    }

    public Animal getShark() {
        return this.shark;
    }

    public void setShark(Shark shark) {
        this.shark = shark;
    }
}
