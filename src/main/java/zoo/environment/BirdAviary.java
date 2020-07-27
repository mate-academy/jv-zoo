package zoo.environment;

import java.util.List;
import zoo.animal.Bird;
import zoo.features.Feedable;
import zoo.features.Flying;

public class BirdAviary implements Feedable, Flying {

    public void addBird(List<? super Bird> birds, List<? extends Bird> bird) {
        birds.addAll(bird);
    }

    public void getBird(List<? extends Bird> bird) {
        bird.forEach(System.out::println);
    }

    @Override
    public String fly() {
        return "Birds can fly";
    }

    @Override
    public String feed() {
        return "Birds are fed!!!";
    }
}
