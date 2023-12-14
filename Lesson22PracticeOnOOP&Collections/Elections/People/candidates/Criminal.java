package main.People.candidates;

import main.Campaigns.Campaign;
import main.Campaigns.CriminalCampaign;
import main.Util;

public class Criminal extends Candidate {


    @Override
    protected Campaign organizeCampaign() {
        return new CriminalCampaign();
    }

    @Override
    protected Education setEducation() {
        return Util.getRandomBoolean()? Education.BASIC_EDUCATION: Education.NO_EDUCATION;
    }
}