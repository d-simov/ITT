package archers.archers;

import archers.bows.Bow;
import archers.bows.SeniorBow;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class SeniorArcher extends Archer {

    public SeniorArcher(String name, int age, char gender, SeniorBow bow, int experience) {
        super(name, age, gender, bow, experience);
    }

    @Override
    boolean validExp(int exp) {
        return exp >= 3 && exp < 10;
    }

    @Override
    protected int getArrowPoints() {
        if(new Random().nextInt(100) < 5){
            incrementMisses();
            return 0;
        }
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
