package archers.archers;

import archers.bows.Bow;
import archers.bows.CarbonBow;

import java.util.Random;

public class VeteranArcher  extends Archer{

    public VeteranArcher(String name, int age, char gender, CarbonBow bow, int experience) {
        super(name, age, gender, bow, experience);
    }

    @Override
    boolean validExp(int exp) {
        return exp >= 10;
    }

    @Override
    protected int getArrowPoints() {
        int points = new Random().nextInt(5)+6;
        points += getBow().getBonus();
        if(points >= 10){
            points = 10;
            incrementBullsEyes();
        }
        return points;
    }

    @Override
    protected int getArrowCount() {
        return 60;
    }
}
