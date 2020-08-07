package core.basesyntax;

import core.basesyntax.premises.Aquarium;
import core.basesyntax.premises.Aviary;
import core.basesyntax.premises.Cage;

public class Zoo {
    private Aquarium aquarium;
    private Cage cage;
    private Aviary aviary;

    public Aquarium getAquarium() {
        return aquarium;
    }

    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public Aviary getAviary() {
        return aviary;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }
}
