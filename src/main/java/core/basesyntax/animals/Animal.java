package core.basesyntax.animals;

public abstract class Animal {
    private int satiety;

    public abstract int move();

    public Animal(int initialSatiety) {
        satiety = initialSatiety;
    }

    public void feed(int food) {
        System.out.format("%s got %d kilocalories from food\n", toString(), food);
        satiety += food;
    }

    public boolean spendEnergy(int energy) {
        if (satiety < energy) {
            return false;
        }
        satiety -= energy;
        return true;
    }
}
