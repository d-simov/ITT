package main.people.voters;

import main.City;
import main.people.candidates.Candidate;

public class WealthyVoter extends Voter {

    public WealthyVoter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        super(hometown, chosenCandidate, payedVote);
    }
}
