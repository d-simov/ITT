package main.Campaigns;

import main.People.candidates.Candidate;
import main.Util;

public abstract class Campaign {

    protected int duration;
    protected int budget;
    protected Candidate campaignOwner;
    protected main.People.voters.Voter voter;


    Campaign() {
        this.duration = Util.getRandomNumber(20,25);
    }

    public void setCampaignOwner(Candidate campaignOwner) {
        this.campaignOwner = campaignOwner;
        initializeBudget();
    }

    private void initializeBudget() {
        this.budget = this.campaignOwner.getCampaignMoney();
    }

    public int getDuration() {
        return duration;
    }

    public int getBudget() {
        return budget;
    }

    public Candidate getCampaignOwner() {
        return campaignOwner;
    }

    protected abstract void generateVoters();
    protected abstract int getDailyVotesGenerated();


}
