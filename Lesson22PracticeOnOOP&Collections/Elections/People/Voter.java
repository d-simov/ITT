package main.people;

import main.City;
import main.campaigns.Campaign;

public abstract class Voter extends Human {

    protected City hometown;
    private Candidate chosenCandidate;
    protected boolean payedVote;
    Campaign campaign;

    public Voter(City hometown, Candidate chosenCandidate, boolean payedVote) {
        this.hometown = hometown;
        this.chosenCandidate = chosenCandidate;
        this.payedVote = payedVote;
        this.campaign = ;
    }

    public void getBallot(){

    }

    public void vote() {

    }

    public Candidate getChosenCandidate() {
        return chosenCandidate;
    }

    protected void setChosenCandidate(Candidate chosenCandidate) {
        this.chosenCandidate = chosenCandidate;
    }
}
