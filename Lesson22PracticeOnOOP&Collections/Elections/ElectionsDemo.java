package main;

import main.People.candidates.Candidate;
import main.People.candidates.Criminal;
import main.People.candidates.Politician;
import main.People.candidates.Showman;
import main.VotingSections.CVC;

import java.util.TreeSet;

public class ElectionsDemo {

    public static void main(String[] args) {

        TreeSet<Candidate> candidates = new TreeSet<>();
        proposeCandidates(candidates, CVC.NUMBER_OF_CANDIDATES);

        for (Candidate candidate: candidates) {

        }
    }

    private static void proposeCandidates(TreeSet<Candidate> candidates, int numberOfCandidates) {
        for (int i = 0; i < numberOfCandidates; i++) {
            int chance = Util.getRandomNumber(0,100);
            if (chance <= 33) {
                candidates.add(new Showman());
            } else if (chance <= 67) {
                candidates.add(new Politician());
            } else {
                candidates.add(new Criminal());
            }
        }
    }


}
