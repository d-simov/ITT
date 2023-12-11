package main.campaigns;

import main.Util;
import main.people.candidates.Candidate;

public abstract class Campaign {

    protected int duration;
    protected int budget;
    protected Candidate campaignOwner;


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
