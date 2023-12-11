package main.people.candidates;

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
    protected Education setEducation() {
        return Util.getRandomBoolean()? Education.HIGH_SCHOOL : Education.UNIVERSITY;
    }
}
