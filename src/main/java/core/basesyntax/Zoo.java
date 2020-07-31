package core.basesyntax;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.animaltype.OtherAnimals;
import core.basesyntax.interfaces.Swimable;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static List<Bird> birdsCage = new ArrayList<>();
    public static List<OtherAnimals> cage = new ArrayList<>();
    public static List<Swimable> aquarium = new ArrayList<>();
}
