package main.People.voters;

import main.City;
import main.People.candidates.Candidate;

public class IlliterateVoter extends  Voter {

    public IlliterateVoter(Candidate chosenCandidate, boolean payedVote) {
        super(chosenCandidate, payedVote);
    }
}
