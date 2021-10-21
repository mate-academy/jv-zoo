package core.basesyntax;

public abstract class Animal {

    private String food;

    public void food(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public Animal setFood(String food) {
        this.food = food;
        return this;
    }

    protected abstract void getInfo();

}
