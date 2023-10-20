package main.archers;

import main.bows.CarbonBow;

import java.util.Random;


public class VeteranArcher extends Archer {


    public VeteranArcher(int experienceInYears) {
        super(experienceInYears);
        this.setBow(new CarbonBow(new Random().nextInt(21) + 28));
//        this.setAge(new Random().nextInt(31) + 22);
        setMaxArrows(60);
    }

    @Override
    boolean validExperience(int experience) {
        return experience >= 10 && experience <= 40;
    }

    @Override
    public void shootArrows() {

    }

    @Override
    protected int getPoints() {
        return getPointsForNonBeginners();
    }

    @Override
    protected boolean successfulShot() {
        return true;
    }
}
