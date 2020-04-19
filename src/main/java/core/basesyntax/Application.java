package core.basesyntax;
//https://github.com/mate-academy/jv-zoo/pull/24

import core.basesyntax.controller.Animal;
import core.basesyntax.controller.Penguin;
import core.basesyntax.controller.Shark;
import core.basesyntax.controller.Solution;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Solution app = new Solution();
        app.addAnimalToZoo();
    }

    public static void iterateAnimals(Collection<? extends Animal> animals) {
        List<Penguin> penguinList = new ArrayList<>();
        penguinList.add(new Penguin("Skipper"));
        penguinList.add(new Penguin("Rico"));
        penguinList.add(new Penguin("Private "));

        List<Shark> sharkList = new ArrayList<>();
        sharkList.add(new Shark("GOBLIN"));
        sharkList.add(new Shark("GREAT WHITE"));
        sharkList.add(new Shark("MAKO"));
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}
