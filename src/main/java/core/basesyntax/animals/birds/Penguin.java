package core.basesyntax.animals.birds;

import core.basesyntax.animals.Bird;
import core.basesyntax.animals.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String type, int age, long id) {
        super(type, age, id);
    }

    @Override
    public void swim() {
        System.out.println("Not a fish but swimming");
    }
}
