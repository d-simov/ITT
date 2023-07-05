package main.Animals;

public abstract class  Animal {

    private int age;

    void eat() {
        System.out.println("The animal is eating.");
    }

    abstract void makeSound();

    void scareAnimal() {
        makeSound();
    }
}
