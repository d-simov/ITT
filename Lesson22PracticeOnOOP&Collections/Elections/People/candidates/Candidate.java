package main.People.candidates;

import main.Campaigns.Campaign;
import main.Util;
import main.People.Human;

public abstract class Candidate extends Human {

    protected enum Education {
        NO_EDUCATION, BASIC_EDUCATION, HIGH_SCHOOL, UNIVERSITY
    }

    private final Education education;
    private final int campaignMoney;
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

    protected abstract Education setEducation();

    public int getCampaignMoney() {
        return this.campaignMoney;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public Education getEducation() {
        return education;
    }
}
