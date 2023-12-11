package main.people.candidates;

import main.Util;
import main.campaigns.Campaign;
import main.campaigns.NormalCampaign;

public class Showman extends Candidate {


    @Override
    protected Campaign organizeCampaign() {
        return new NormalCampaign();
    }

    @Override
    protected Education setEducation() {
        int chance = Util.getRandomNumber(0,100);
        if (chance < 25) {
            return Education.NO_EDUCATION;
        }
        if (chance < 50) {
            return Education.BASIC_EDUCATION;
        }
        if (chance < 75) {
            return Education.HIGH_SCHOOL;
        }
        return Education.UNIVERSITY;
    }
}
