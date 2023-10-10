package main.PolimorphysmWithSociety.population;

import main.Helper;

import java.util.Random;

public abstract class Human {

    private final String name;
    boolean isAlive;
    public static final int UTMOST_AGE = 111;
    private int age;
    private Gender gender;
    private String[] maleNames = {"Peter", "George", "Alexander", "Brad", "Silvester", "Arnold", "Russel",
            "Jack", "Phil"};
    private String[] femaleNames = {"Dolly", "Seline", "Whitney", "Sigourney", "Winona", "Kate", "Diana", "Elizabeth",
            "Emma", "Christina"};

    public Human() {
        Random rand = new Random();
        this.gender = (rand.nextBoolean() ? Gender.MALE : Gender.FEMALE);
        if (this.gender == Gender.MALE) {
            this.name = maleNames[Helper.getRandomInt(0,maleNames.length-1)];
        } else {
            this.name = femaleNames[Helper.getRandomInt(0,femaleNames.length-1)];
        }
        this.age = 0;
        this.isAlive = true;
    }

    public void startYourDay() {
        System.out.print(this.name + " opens ");
        if (this.gender == Gender.MALE) {
            System.out.print("his ");
        } else {
            System.out.print("her ");
        }
        System.out.println("eyes. ");
    }

    public void getInfo() {
        System.out.println(this.name + " is a " + this.age + " year old " + this.gender + ".");
    }

    public void growUp() {
        if (this.age < UTMOST_AGE) {
            this.age++;
        } else {
            isAlive = false;
            if (this.gender == Gender.MALE) {
                System.out.println(this.name + "has passed away due to his old age.");
            } else {
                System.out.println(this.name + "has passed away due to her old age.");
            }
        }
    }


}
