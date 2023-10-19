package main;

import main.archers.Archer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ITArcherSportsClub {

    private String name;
    private String address;
    private String coach;
    private ArrayList<Archer> archers;
    private CompetitionDiary competitionDiary;

    public ITArcherSportsClub(String name, String address, String coach) {
        this.name = name;
        this.address = address;
        this.coach = coach;
        this.archers = new ArrayList<>();
        this.competitionDiary = new CompetitionDiary();
    }

    public void addArcher(Archer a) {
        this.archers.add(a);
    }

    public void startTournament() {
        printParticipantsList();
        incrementArchersParticipations();
        shootAllArrows();
        printTournamentStatistics();
    }

    private void printTournamentStatistics() {
        printWinner();
        printAverageResult();
        printSharpshooter();
        printLooser();
    }

    private void printWinner() {
        Archer winner = archers.get(0);
        for (int i = 0; i < archers.size(); i++) {
            if(archers.get(i).getCurrentResult() > winner.getCurrentResult()) {
                winner = archers.get(i);
            }
        }
    }

    private void shootAllArrows() {
        System.out.println("\n\n   T H E   T O U R N A M E N T     B E G I N S     I N    " +
                "3 ,   2 ,    1 . . .    G O    G O    G O ! ! ! \n");
        for (Archer archer : this.archers) {
            archer.shootArrows();
        }
    }

    private void incrementArchersParticipations() {
        for (Archer archer : this.archers) {
            archer.incrementParticipationCount();
            archer.setCurrentResult(0);
            archer.setMisses(0);
        }
    }

    public void printParticipantsList() {
        archers.sort((archer1, archer2) -> archer1.getName().compareTo(archer2.getName()));
        for (Archer archer : this.archers) {
            archer.getInfo();
        }
        System.out.println();
    }


}
