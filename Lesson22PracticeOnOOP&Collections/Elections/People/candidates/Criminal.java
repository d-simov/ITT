package main.people.candidates;

import main.Util;
import main.campaigns.Campaign;
import main.campaigns.CriminalCampaign;

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