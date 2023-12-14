package main.People.voters;

import main.City;
import main.People.candidates.Candidate;

public class WealthyVoter extends Voter {

    public WealthyVoter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        super(hometown, chosenCandidate, payedVote);
    }
}
