package main.Animals;

public class Demo {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Gotham Zoo", "Gotham City", 100);


        zoo.putAnimalInZoo(new Cat());
        zoo.putAnimalInZoo(new Dog());
        zoo.putAnimalInZoo(new Bear());


        for (int i = 0; i < zoo.getAnimalsInZoo(); i++) {
            zoo.getAnimals()[i].eat();
            zoo.getAnimals()[i].makeSound();
            System.out.println();
        }

        System.out.println(" -------- SCARE -------- ");
        zoo.scareTHemAll();
    }
}
