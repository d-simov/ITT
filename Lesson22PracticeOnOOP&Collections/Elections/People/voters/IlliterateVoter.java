package main.people.voters;

import main.City;
import main.people.candidates.Candidate;

public class IlliterateVoter extends  Voter {

    public IlliterateVoter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        super(hometown, chosenCandidate, payedVote);
    }
}
