package core.basesyntax;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;
import java.util.List;

public class Zoo {

    private List<Aviary<? extends Animal>> aviaries;

    public List<Aviary<? extends Animal>> getAviaries() {
        return aviaries;
    }

    public void setAviaries(List<Aviary<? extends Animal>> aviaries) {
        this.aviaries = aviaries;
    }
}
