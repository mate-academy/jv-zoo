package zoo.environment;

import java.util.List;
import zoo.animal.Fish;
import zoo.features.Feedable;
import zoo.features.Swimmable;

public class Aquarium implements Swimmable, Feedable {

    public void addFish(List<? super Fish> fishes, List<? extends Fish> fish) {
        fishes.addAll(fish);
    }

    public void getFish(List<? extends Fish> fish) {
        fish.forEach(System.out::println);
    }

    @Override
    public String swim() {
        return "Fish can swim";
    }

    @Override
    public String feed() {
        return "Fishes are fed!!!";
    }
}
