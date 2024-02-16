package main.bows;

import main.Archer;
import main.archers.Archer;
import main.archers.JuniorArcher;
import main.archers.SeniorArcher;
import main.archers.VeteranArcher;
import main.bows.AluminiumBow;
import main.bows.CarbonBow;
import main.bows.ITArcherSportsClub;
import main.bows.WoodenBow;

import java.util.Random;

public class ArchersDemo {

    public static void main(String[] args) {
        
        ITArcherSportsClub club = new ITArcherSportsClub("ИТ Арчърс", "София, Младост 2", "Красимир Стоев");
        Archer archer;
        Random r = new Random();
        for (int i = 0; i < 40; i++) {
            int chance = r.nextInt(100);
            if (chance <= 33) {
                archer = new JuniorArcher(r.nextInt(4));
            }
            else if (chance <= 66) {
                archer = new SeniorArcher((r.nextInt(6) + 3));
            }
            else {
                archer = new VeteranArcher(r.nextInt(30) + 10);
            }

            club.addArcher(archer);
        }

        System.out.println("\n===============================================================================\n" +
                "                                  S H O O T I N G" +
                "\n===============================================================================\n");
        club.startTournament();


    }
}
