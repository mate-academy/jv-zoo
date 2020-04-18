package core.basesyntax;

import core.basesyntax.animals.birds.FlyingBird;
import core.basesyntax.animals.birds.Penguin;
import core.basesyntax.animals.cats.Cat;
import core.basesyntax.animals.fishes.Fish;
import java.util.HashSet;
import java.util.Set;

public class Zoo {
    private Set<? super FlyingBird> cageForFlyingBirds = new HashSet<>();
    private Set<? super Fish> aquarium = new HashSet<>();
    private Set<Penguin> penguinsAviary = new HashSet<>();
    private Set<Cat> catsEnclosure = new HashSet<>();

    public void addFlyingBird(FlyingBird flyingBird) {
        cageForFlyingBirds.add(flyingBird);
    }

    public void addFish(Fish fish) {
        aquarium.add(fish);
    }

    public void addPenguin(Penguin penguin) {
        penguinsAviary.add(penguin);
    }

    public void addCat(Cat cat) {
        catsEnclosure.add(cat);
    }

    public void feedBirds() {
        Set<? extends FlyingBird> flyingBirds = new HashSet(this.cageForFlyingBirds);
        for (FlyingBird flyingBird : flyingBirds) {
            flyingBird.eat();
        }
    }

    public void feedFishes() {
        Set<? extends Fish> fishes = new HashSet(this.aquarium);
        for (Fish fish : fishes) {
            fish.eat();
        }
    }

    public void feedCats() {
        Set<? extends Cat> cats = new HashSet(this.catsEnclosure);
        for (Cat cat : cats) {
            cat.eat();
        }
    }

    public void feedPenguins() {
        for (Penguin penguin : penguinsAviary) {
            penguin.eat();
        }
    }

    public void feedAllAnimals() {
        feedCats();
        feedPenguins();
        feedFishes();
        feedBirds();
    }
}
