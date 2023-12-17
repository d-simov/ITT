package main.Campaigns;

import main.People.voters.IlliterateVoter;
import main.People.voters.Voter;
import main.Util;
import main.VotingSections.CVC;

public class NormalCampaign extends Campaign {

    public NormalCampaign() {
        super();
    }

    @Override
    protected void generateVoters(CVC localSections) {
        for (int i = 0; i < this.getDailyVotesGenerated(); i++) {
            int chance = Util.getRandomNumber(0,100);
            Voter voter = null;
            if (chance <= 33) {
                voter = generateNewIlliterateVoter();
            } else if(chance <= 67) {
                voter = generateNewMiddleClassVoter();
            } else {
                voter = generateNewWealthyVoter();
            }
            for (String city : CVC.getLocalSections().keySet()) {
                if (city.equals(voter.getHometown())) {
                    localSections.
                }
            }
        }
    }

    @Override
    protected int getDailyVotesGenerated() {
        return 100;
    }
}
