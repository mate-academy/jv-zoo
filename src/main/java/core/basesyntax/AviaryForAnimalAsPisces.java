package core.basesyntax;

import core.basesyntax.model.Pisces;

public class AviaryForAnimalAsPisces<T extends Pisces> {
    private T pisces;

    public AviaryForAnimalAsPisces(T aves) {
        this.pisces = aves;
    }

    public T getPisces() {
        return pisces;
    }

}
