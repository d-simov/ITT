package main.PolimorphysmWithSociety.population;

import main.Helper;

import java.util.Random;

public class Family {

    private final String name;
    private String[] familyNames = {"Jameson", "Peterson", "Jackson", "Crow", "Russel", "Stallone",
            "Nicholson", "Collins", "Watson", "Richie"};
    private Human[] family;
    private int familyMembers = Helper.getRandomInt(1,5);

    public Family() {
        this.name = familyNames[Helper.getRandomInt(0,familyNames.length - 1)];
        family = new Human[familyMembers];
        for (int i = 0; i < familyMembers; i++) {
            if (i == 0) {
                Random rand = new Random();
                family[i] = ((rand.nextBoolean())? new Worker() : new Retiree());
            } else {
                int chance = Helper.getRandomInt(1, 6);
                family[i] =  switch (chance) {
                    case (1) -> new Baby();
                    case (2) -> new Toddler();
                    case (3) -> new Student();
                    case (4) -> new Collegian();
                    case (5) -> new Worker();
                    case (6) -> new Retiree();
                    default -> new Graduate() {
                        @Override
                        public void startYourDay() {
                            super.startYourDay();
                        }
                    };
                };

            }

        }
    }

    public void startYourDay() {
        for (int i = 0; i < familyMembers; i++) {
            family[i].startYourDay();
        }
    }

    public void getInfo() {
        if (this.name.charAt(this.name.length()-1) == 's') {
            System.out.println("\nThe " + this.name + "es are:");
        } else {
            System.out.println("\nThe " + this.name + "s are:");
        }
        for (int i = 0; i < family.length; i++) {
            family[i].getInfo();
        }
    }
}
