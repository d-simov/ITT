package main.People.voters;

import main.City;
import main.People.candidates.Candidate;

public class IlliterateVoter extends  Voter {

    public IlliterateVoter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        super(hometown, chosenCandidate, payedVote);
    }
}
