package main;

import main.people.Human;

import java.util.TreeSet;

public class ElectionsDemo {

    public static void main(String[] args) {

        TreeSet<Human> candidates = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            System.out.println(Util.getRandomNumber(20, 25));
        }
	candidates.add(new Showman());
        System.out.println(candidates.pollFirst());
    }
}
