package core.basesyntax;

public abstract class Zoo {
    String color;
    int age;
    public Zoo (String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void print() {
        System.out.println(this.color + " - " + this.age);
    }

    public abstract void feed();
}
