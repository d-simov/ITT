package main.people.voters;

import main.City;
import main.people.candidates.Candidate;

public class MiddleClassVoter extends Voter {

    public MiddleClassVoter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        super(hometown, chosenCandidate, payedVote);
    }
}
