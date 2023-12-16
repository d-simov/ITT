package Elections.Candidates;

import Elections.Campaigns.Campaign;
import Elections.Candidates.Education.IEducation;

public abstract class Candidate {

    private String name;
    private Campaign campaign;
    private int budget;
    IEducation education;

    public Candidate(String name, int budget, IEducation education) {
//        TO DO Validate
        this.name = name;
        this.budget = budget;
        this.education = education;
    }
}
