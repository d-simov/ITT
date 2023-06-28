package archers;

import archers.archers.Archer;
import archers.bows.CarbonBow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Club {

    private String name;
    private String address;
    private String coach;
    private ArrayList<Archer> archers;

    public Club(String name, String address, String coach) {
        this.name = name;
        this.address = address;
        this.coach = coach;
        this.archers = new ArrayList<>();
    }

    public void addArcher(Archer a){
        this.archers.add(a);
    }

    public void startTournament(){
        System.out.println("----------------------THE TOURNAMENT BEGINS. CONTESTANTS ARE ------------------------------");
        printArchers();
        System.out.println("----------------------LET THERE BE CARNAGE------------------------------");
        shootArrows();
        System.out.println("----------------------STATISTICS------------------------------");
        printStatistics();
    }

    private void printStatistics() {
        System.out.println("------WINNER------");
        printWinner();
        System.out.println("------AVG RESULT------");
        printAvgResult();
        System.out.println("------SHARPSHOOTER------");
        printSharpShooter();
        System.out.println("------MORON------");
        printLoser();
        System.out.println("------WOMEN BY ACCURACY------");
        printWomenByAccuracy();
        System.out.println("------MEN WITH CARBON BOWS BY EXP------");
        printMenWithCarbonBowByExp();
    }

    private void printMenWithCarbonBowByExp() {
        ArrayList<Archer> men = new ArrayList<>();
        for (int i = 0; i < archers.size(); i++) {
            if(!archers.get(i).isFemale() && archers.get(i).getBow() instanceof CarbonBow){
                men.add(archers.get(i));
            }
        }

        men.sort(Comparator.comparingInt(Archer::getExperience).reversed());
        //foreach loop
//        for(Archer a : men){
//            System.out.println(a);
//        }
        for (int i = 0; i < men.size(); i++) {
            System.out.println(men.get(i));
        }
    }

    private void printWomenByAccuracy() {
        ArrayList<Archer> women = new ArrayList<>();
        for (int i = 0; i < archers.size(); i++) {
            if(archers.get(i).isFemale()){
                women.add(archers.get(i));
            }
        }

        women.sort(Comparator.comparingInt(Archer::getPoints).reversed());
        int maxPoints = women.get(0).getPoints();
        for (int i = 0; i < women.size(); i++) {
            System.out.println(women.get(i) + " with " + (Double.valueOf(women.get(i).getPoints()) / maxPoints * 100) + "% accuracy");
        }

    }

    private void printLoser() {
        Archer moron = archers.get(0);
        for (int i = 1; i < archers.size(); i++) {
            if(moron.getMisses() < archers.get(i).getMisses()){
                moron = archers.get(i);
            }
        }
        System.out.println(moron);
    }

    private void printSharpShooter() {
        Archer sharpshooter = archers.get(0);
        for (int i = 1; i < archers.size(); i++) {
            if(sharpshooter.getBullsEyes() < archers.get(i).getBullsEyes()){
                sharpshooter = archers.get(i);
            }
        }
        System.out.println(sharpshooter);
    }

    private void printAvgResult() {
        System.out.println(
                archers.stream()
                        .mapToDouble(a -> a.getPoints())
                        .average());
    }

    private void printWinner() {
        archers.sort(Comparator.comparingInt(Archer::getPoints).reversed());
        System.out.println(archers.get(0));
    }



    private void shootArrows() {
        for (int i = 0; i < archers.size(); i++) {
            int points = archers.get(i).shootArrows();
            archers.get(i).setPoints(points);
        }
    }

    private void printArchers() {
        //magic sort
        archers.sort(Comparator.comparing(Archer::getName));
        for (int i = 0; i < archers.size(); i++) {
            archers.get(i).incrementTournamentsCount();
            System.out.println(archers.get(i));
        }
    }
}
