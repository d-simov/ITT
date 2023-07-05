package main.Animals;

public class Bear extends  Animal {

    int strength;
    void brakeDownATree() {
        System.out.println("The bear stands up and the tree goes down.");
    }


    @Override
    void makeSound() {
        System.out.println("Grrr-rrrr!");
    }

    @Override
    void scareAnimal() {
        super.scareAnimal();
        this.brakeDownATree();
    }
}
