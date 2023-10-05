package archers.archers;

import archers.bows.Bow;
import archers.bows.WoodenBow;

import java.util.Random;

public class JuniorArcher extends Archer{

    public JuniorArcher(String name, int age, char gender, WoodenBow bow, int experience) {
        super(name, age, gender, bow, experience);
    }

    @Override
    boolean validExp(int exp) {
        return exp >= 1 && exp < 3;
    }

    @Override
    protected int getArrowPoints() {
        if(new Random().nextInt(100) < 10){
            incrementMisses();
            return 0;
        }
        int points = new Random().nextInt(10)+1;
        if(points == 10){
            incrementBullsEyes();
        }
        return points;
    }

    @Override
    protected int getArrowCount() {
        return 30;
    }
}
