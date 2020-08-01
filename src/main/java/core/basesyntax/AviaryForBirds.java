package core.basesyntax;

public class AviaryForBirds {
    private Animal sparrow;

    public AviaryForBirds(Sparrow sparrow) {
        setSparrow(sparrow);
    }

    public Animal getSparrow() {
        return this.sparrow;
    }

    public void setSparrow(Sparrow sparrow) {
        this.sparrow = sparrow;
    }
}
