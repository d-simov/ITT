package main.Campaigns;

import main.VotingSections.CVC;

public class CriminalCampaign extends Campaign {

    private static final int percentagePayedVotes = 50;


    @Override
    protected void generateVoters(CVC localSections) {
        for (int i = 0; i < getDailyVotesGenerated(); i++) {
//            ENTER SOME CODE HERE;
        }
    }

    @Override
    protected int getDailyVotesGenerated() {
        return 120;
    }
}
