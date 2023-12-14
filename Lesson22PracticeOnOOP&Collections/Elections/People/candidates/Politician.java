package main.People.candidates;

import main.Campaigns.Campaign;
import main.Campaigns.CriminalCampaign;
import main.Campaigns.NormalCampaign;
import main.People.candidates.Candidate;
import main.Util;

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
