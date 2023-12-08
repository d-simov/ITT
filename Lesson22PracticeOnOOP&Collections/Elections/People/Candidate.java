package main.people;

import main.campaigns.Campaign;

public abstract class Candidate extends Human {

    protected enum Education {
        NO_EDUCATION, BASIC_EDUCATION, HIGH_SCHOOL, UNIVERSITY;
    }

    private Education education;
    private int campaignMoney;
    private static final int MIN_BUDGET = 50000;
    private static final int MAX_BUDGET = 300000;
    private Campaign campaign;

    Candidate() {
        super();
        this.education = getEducation();
        this.campaignMoney = rand.nextInt(250000) + 50000;
        this.campaign = organizeCampaign();
        this.campaign.setCampaignOwner(this);
    }

    protected abstract Campaign organizeCampaign();

    protected abstract Education getEducation();

    public int getCampaignMoney() {
        return campaignMoney;
    }
}
