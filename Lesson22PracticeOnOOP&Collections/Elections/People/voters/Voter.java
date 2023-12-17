package main.People.voters;

import main.City;
import main.Util;
import main.Campaigns.Campaign;
import main.People.candidates.Candidate;
import main.People.Human;

import static main.City.*;

public abstract class Voter extends Human {

    protected City hometown;
    private Candidate chosenCandidate;
    protected boolean payedVote;
    private Campaign campaign;

    public Voter(Candidate chosenCandidate, boolean payedVote) {
        this.hometown = setCity();
        this.chosenCandidate = chosenCandidate;
        this.payedVote = payedVote;

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

    public City getHometown() {
        return hometown;
    }

    public Candidate getChosenCandidate() {
        return chosenCandidate;
    }

    protected void setChosenCandidate(Candidate chosenCandidate) {
        this.chosenCandidate = chosenCandidate;
    }
}
