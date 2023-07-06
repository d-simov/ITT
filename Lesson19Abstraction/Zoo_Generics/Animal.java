package main.Zoo_Generics;

public abstract class Animal {

    private String name;
    private int age;

    Animal (int age, String name) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        if (name.trim().length() > 1) {
            this.name = name;
        } else {
            this.name = " unknown " + (String) this.getClass().getSimpleName();
        }
    }

    public void eat () {
        System.out.println(this.getClass().getSimpleName() + " is eating.");
    }

    public abstract void makeSound();

    public void reactWhenScared() {
        makeSound();
    }


}
