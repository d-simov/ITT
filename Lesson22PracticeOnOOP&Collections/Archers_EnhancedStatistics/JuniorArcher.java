package main.bows;

import main.bows.WoodenBow;

import java.util.Random;

public class JuniorArcher extends main.archers.Archer {


    public JuniorArcher(int experienceInYears) {
        super(experienceInYears);
        this.setBow(new WoodenBow(new Random().nextInt(11) + 20));
        this.setMaxArrows(30);
    }

    @Override
    protected boolean validExperience(int experience) {
        return experience > 0 && experience < 3;
    }


    @Override
    protected int getPoints() {
        if (successfulShot()) {
            int points = new Random().nextInt(10)+ 1 + this.getBow().getBonusPoints();
            System.out.println(this.getName() + " (" + this.getClass().getSimpleName() + "-" + this.getAge() +  ") hit " + points + ".");
            return points;

        } else {
            incrementMisses();
            System.out.println(this.getName() + " (" + this.getClass().getSimpleName() + "-" + this.getAge() +  ") missed.");
            return 0;

        }
    }

    @Override
    protected boolean successfulShot() {
        if (new Random().nextInt(101) <= 10) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected int getPointsForNonBeginners() {
        return 0;
    }
}
