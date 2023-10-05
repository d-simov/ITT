package archers;

import archers.archers.Archer;
import archers.archers.JuniorArcher;
import archers.archers.SeniorArcher;
import archers.archers.VeteranArcher;
import archers.bows.AluminiumBow;
import archers.bows.CarbonBow;
import archers.bows.SeniorBow;
import archers.bows.WoodenBow;

import java.util.Random;

public class Demo {

    private static final String[] names = {"Krasi", "Pepi", "Moni", "Radi", "Aleks", "Stefi"};

    private static String getRandomName(){
        return names[new Random().nextInt(names.length)];
    }

    private static char getRandomGender(){
        return new Random().nextBoolean() ? 'F' : 'M';
    }

    private static int getRandomAge() {
        return new Random().nextInt(40) + 12;
    }

        public static void main(String[] args) {

        Club club = new Club("ИТ Арчър", "Mladost 2", "Stoev");
        Archer archer;
        Random r = new Random();
        for (int i = 0; i < 40; i++) {
            int chance = r.nextInt(100);
            if(chance < 33){
                archer = new JuniorArcher(
                        getRandomName(),
                        getRandomAge(),
                        getRandomGender(),
                        new WoodenBow("Hoyt", 3,25),
                        2);
            }
            else if(chance < 66){
                archer = new SeniorArcher(
                        getRandomName(),
                        getRandomAge(),
                        getRandomGender(),
                        getRandomSeniorBow(),
                        2);
            }
            else {
                archer = new VeteranArcher(
                        getRandomName(),
                        getRandomAge(),
                        getRandomGender(),
                        new CarbonBow("Hoyt", 3,25),
                        2);
            }
            club.addArcher(archer);
        }

        club.startTournament();
    }

    private static SeniorBow getRandomSeniorBow() {
        return new Random().nextBoolean() ?
                new CarbonBow("Hoyt", 2.8,33) :
                new AluminiumBow("Hoyt", 3.1,35);
    }
}
