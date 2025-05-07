package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class InZoo {
    public static void main(String[] args) {

        Area[] areas = new Area[]{new FlyingArea(), new PoolArea(),
                new TerrestrialArea(), new PoolArea()};

        Animals[] animals = new Animals[]{new Penguin(), new Shark(),
                new Sparrow(), new Tiger()};

        Zoo zoo = new Zoo();
        for (Area area : areas) {
            zoo.areas.add(area);
        }

        for (Animals animal : animals) {
            zoo.animals.add(animal);
            setToArea(animal, areas);
        }

        for (Animals animal : animals) {
            System.out.println("\n");
            animal.sayHello();
            animal.feed();
        }
    }

    private static void setToArea(Animals animal, Area[] areas) {
        for (Area area : areas) {
            if (area.isEmpty && area.movingType.equals(animal.movingType)) {
                area.isEmpty = false;
                area.animal = animal;
            }
        }
    }
}
