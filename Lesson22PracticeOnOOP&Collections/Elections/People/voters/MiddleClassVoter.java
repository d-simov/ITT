package main.People.voters;

import main.City;
import main.People.candidates.Candidate;

public class MiddleClassVoter extends Voter {

    public MiddleClassVoter(Candidate chosenCandidate, boolean payedVote) {
        super(chosenCandidate, payedVote);
    }
}
