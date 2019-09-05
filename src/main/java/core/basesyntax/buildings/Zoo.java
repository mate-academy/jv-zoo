package core.basesyntax.buildings;

public class Zoo {
    private Aviary aviary;
    private Enclosure enclosure;
    private Aquarium aquarium;

    public Zoo() {
    }

    public Zoo(Aviary aviary, Enclosure enclosure, Aquarium aquarium) {
        this.aviary = aviary;
        this.enclosure = enclosure;
        this.aquarium = aquarium;
    }

    public Aviary getAviary() {
        return aviary;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }
}
