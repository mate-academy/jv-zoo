package core.basesyntax;

import core.basesyntax.model.Penguin;
import core.basesyntax.model.Shark;
import core.basesyntax.model.Sparrow;
import core.basesyntax.model.Tiger;
import core.basesyntax.model.Zoo;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Penguin kavalski = new Penguin();
        Sparrow capitanJackSparrow = new Sparrow();
        Shark meg = new Shark();
        Tiger tigrulia = new Tiger();
        Zoo babushkinDvorik = new Zoo(List.of(meg), List.of(capitanJackSparrow, kavalski),
                List.of(tigrulia));
        babushkinDvorik.printMessage();
        kavalski.getInfo();
        capitanJackSparrow.getInfo();
        meg.getInfo();
        tigrulia.getInfo();
    }
}
