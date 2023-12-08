package main.people;

import main.Util;
import main.campaigns.Campaign;
import main.campaigns.CriminalCampaign;
import main.campaigns.NormalCampaign;

public class Politician extends Candidate {


    @Override
    protected Campaign organizeCampaign() {
        return (Util.getRandomBoolean()? new CriminalCampaign() : new NormalCampaign());
    }

    @Override
    protected Education getEducation() {
        return rand.nextBoolean()? Education.HIGH_SCHOOL : Education.UNIVERSITY;
    }
}
