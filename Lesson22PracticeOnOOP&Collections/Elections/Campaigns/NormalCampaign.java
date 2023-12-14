package main.Campaigns;

public class NormalCampaign extends Campaign {

    public NormalCampaign() {
        super();
    }

    @Override
    protected void generateVoters() {
        for (int i = 0; i < this.getDailyVotesGenerated(); i++) {
//            ENTER SOME CODE HERE;
        }
    }

    @Override
    protected int getDailyVotesGenerated() {
        return 100;
    }
}
