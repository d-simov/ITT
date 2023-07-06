package main.Zoo_Generics;

import org.w3c.dom.ls.LSOutput;

public class Human extends Animal {

    private boolean isCriminal;
    private Crime crime;

    Human(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Leave me alone!");
    }

    @Override
    public void reactWhenScared() {
        super.reactWhenScared();
        System.out.println("Hey! You scared me!");
    }

}
