package core.basesyntax.animal;

public abstract class Animal {
    private String name;
    private int age;
    private boolean isRare;

    public Animal(String name, int age, boolean isRare) {
        this.name = name;
        this.age = age;
        this.isRare = isRare;
    }

    public abstract void feed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRare() {
        return isRare;
    }

    public void setRare(boolean rare) {
        isRare = rare;
    }
}
