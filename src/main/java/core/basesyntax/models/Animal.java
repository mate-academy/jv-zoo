package core.basesyntax.models;

public abstract class Animal {
    private String typeOfAnimal;

    public Animal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public abstract void showAbility();
}
