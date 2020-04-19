package core.basesyntax;

import core.basesyntax.controller.Pisces;

public class AviaryForAnimalAsPisces<T extends Pisces> {
    private T pisces;

    public AviaryForAnimalAsPisces(T aves) {
        this.pisces = aves;
    }

    public T getPisces() {
        return pisces;
    }

    public void setPisces(T pisces) {
        this.pisces = pisces;
    }
}
