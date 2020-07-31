package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Zoo {
    private String name;
    private final List<Aviary> aviaryList;

    public Zoo(String name) {
        this.name = name;
        this.aviaryList = new ArrayList<>();
    }

    public Zoo(String name, List<Aviary> aviaryList) {
        this.name = name;
        this.aviaryList = aviaryList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public List<Aviary> getAviaryList() {
        return aviaryList;
    }

    public void addAviary(Aviary aviary) {
        if (aviary != null) {
            aviaryList.add(aviary);
        }
    }

    public void feedAllAnimalsInZoo() {
        for (Aviary aviary : aviaryList) {
            aviary.feedAllInAviary();
        }
    }
}
