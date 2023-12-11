package main.people.candidates;

import main.Util;
import main.campaigns.Campaign;
import main.people.Human;

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
        this.education = setEducation();
        this.campaignMoney = Util.getRandomNumber(MIN_BUDGET, MAX_BUDGET);
        this.campaign = organizeCampaign();
        this.campaign.setCampaignOwner(this);
    }

    protected abstract Campaign organizeCampaign();

    protected abstract Education getEducation();


    public Education getEducation() {
        return education;
    }

    public int getCampaignMoney() {
        return this.campaignMoney;
    }

    public Campaign getCampaign() {
        return campaign;
    }
}
