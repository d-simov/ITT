package main.Zoo_Generics;

public class Cat extends Animal {

    Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
