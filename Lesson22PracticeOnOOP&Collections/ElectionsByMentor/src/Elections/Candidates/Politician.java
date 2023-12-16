package Elections.Candidates;

import Elections.Candidates.Candidate;
import Elections.Candidates.Education.PoliticalEducation;

public class Politician extends Candidate {
    public Politician(String name, int budget, PoliticalEducation education) {
        super(name, budget, education);
    }
}
