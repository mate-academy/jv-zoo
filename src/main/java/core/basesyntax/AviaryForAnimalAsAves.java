package core.basesyntax;

import core.basesyntax.impl.Aves;

public class AviaryForAnimalAsAves<T extends Aves> {
    private T aves;

    public AviaryForAnimalAsAves(T aves) {
        this.aves = aves;
    }

    public T getAves() {
        return aves;
    }

    public void setAves(T aves) {
        this.aves = aves;
    }
}
