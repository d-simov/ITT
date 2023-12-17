package main.Campaigns;

import main.People.candidates.Candidate;
import main.People.voters.IlliterateVoter;
import main.People.voters.MiddleClassVoter;
import main.People.voters.Voter;
import main.People.voters.WealthyVoter;
import main.Util;
import main.VotingSections.CVC;

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

    protected abstract void generateVoters(CVC localSections);
    protected abstract int getDailyVotesGenerated();

    protected Voter generateNewIlliterateVoter() {
        return new IlliterateVoter(this.campaignOwner , Util.getRandomBoolean());
    }

    protected Voter generateNewMiddleClassVoter() {
        return new MiddleClassVoter(this.campaignOwner , Util.getRandomBoolean());
    }

    protected Voter generateNewWealthyVoter() {
        return new WealthyVoter(this.campaignOwner , Util.getRandomBoolean());
    }

}
