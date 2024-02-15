package main.archers;

import main.bows.AluminiumBow;
import main.bows.CarbonBow;
import main.bows.SeniorBow;

import java.util.Random;

public class SeniorArcher extends Archer {


    public SeniorArcher(int experienceInYears) {
        super(experienceInYears);
        this.setBow(getRandomSeniorBow());
//        this.setAge((new Random().nextInt(32) + 21));
        setMaxArrows(60);
    }

    private SeniorBow getRandomSeniorBow() {
        Random r = new Random();
        return r.nextBoolean() ?
                new AluminiumBow(r.nextInt(16) + 25) :
                new CarbonBow(r.nextInt(21) + 28);
    }

    @Override
    protected boolean validExperience(int experience) {
        return experience >= 3 && experience < 10;
    }


    @Override
    protected int getPoints() {
        return getPointsForNonBeginners();
    }

    @Override
    protected boolean successfulShot() {
        if (new Random().nextInt(101) <= 5) {
            return false;
        } else {
            return true;
        }
    }
}
