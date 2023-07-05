package main.Animals;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Waf-Waf!");
    }

    void bringStick() {
        System.out.println("Brings stick.");
    }

    @Override
    void scareAnimal() {
        System.out.println("puts tail between legs.");
        super.scareAnimal();
    }
}


