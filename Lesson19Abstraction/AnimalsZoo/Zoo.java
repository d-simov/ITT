package main.Animals;

public class Zoo {

    private String name;
    private String address;

    private Animal[] animals;
    private int animalsInZoo = 0;

    Zoo(String name, String address, int numberOfAnimals) {
        if (name.trim().length() > 1) {
            this.name = name;
        } else {
            this.name = "City Zoo";
        }
        this.address = address;
        animals = new Animal[numberOfAnimals];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void scareTHemAll() {
        for (int i = 0; i < this.animalsInZoo; i++) {
            this.animals[i].scareAnimal();
            System.out.println();
        }
    }

    public int getAnimalsInZoo() {
        return animalsInZoo;
    }

    public void setAnimalsInZoo(int animalsInZoo) {
        this.animalsInZoo = animalsInZoo;
    }

    public void putAnimalInZoo(Animal animal) {
        if (animal != null) {
            this.animals[animalsInZoo++] = animal;
        }
    }
}
