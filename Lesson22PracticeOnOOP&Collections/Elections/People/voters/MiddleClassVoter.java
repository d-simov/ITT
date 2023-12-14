package main.People.voters;

import main.City;
import main.People.candidates.Candidate;

public class MiddleClassVoter extends Voter {

    public MiddleClassVoter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        super(hometown, chosenCandidate, payedVote);
    }
}
