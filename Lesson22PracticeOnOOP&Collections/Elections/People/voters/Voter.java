package main.people.voters;

import main.City;
import main.Util;
import main.campaigns.Campaign;
import main.people.candidates.Candidate;
import main.people.Human;

import static main.City.*;

public abstract class Voter extends Human {

    protected City hometown;
    private Candidate chosenCandidate;
    protected boolean payedVote;
    Campaign campaign;

    public Voter(Candidate chosenCandidate, boolean payedVote) {
        this.hometown = setCity();
        this.chosenCandidate = chosenCandidate;
        this.payedVote = payedVote;
//        this.campaign = ;
    }

    public void getBallot(){

    }

    public void vote() {

    }

    private City setCity() {
        int chance = Util.getRandomNumber(0,100);
        if (chance < 50) {
            return SOFIA;
        } else if (chance < 75) {
            return PLOVDIV;
        } else if (chance < 86) {
            return PLEVEN;
        } else if (chance < 95) {
            return VELIKO_TYRNOVO;
        } else if (chance < 98) {
            return TRYAVNA;
        } else {
            return POPOVO;
        }
    }

    public Candidate getChosenCandidate() {
        return chosenCandidate;
    }

    protected void setChosenCandidate(Candidate chosenCandidate) {
        this.chosenCandidate = chosenCandidate;
    }
}
