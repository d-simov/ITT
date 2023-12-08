package main.people;

import main.campaigns.Campaign;
import main.campaigns.CriminalCampaign;

public class Criminal extends Candidate {


    @Override
    protected Campaign organizeCampaign() {
        return new CriminalCampaign();
    }

    @Override
    protected Education getEducation() {
        return rand.nextBoolean()? Education.BASIC_EDUCATION: Education.NO_EDUCATION;
    }
}
