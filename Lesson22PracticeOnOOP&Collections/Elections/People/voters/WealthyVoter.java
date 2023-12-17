package main.People.voters;

import main.City;
import main.People.candidates.Candidate;

public class WealthyVoter extends Voter {

    public WealthyVoter(Candidate chosenCandidate, boolean payedVote) {
        super(chosenCandidate, payedVote);
    }
}
