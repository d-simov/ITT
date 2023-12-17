package main.VotingSections;

import main.People.voters.Voter;

import java.util.ArrayList;
import java.util.List;

public class LVC {

    private String name;
    private int numberOfVoters;
    private ArrayList<Voter> voters;

    public LVC(String town) {
        this.name = town;
        voters = new ArrayList<>();
    }

    public ArrayList<Voter> getVoters() {
        return voters;
    }
}
