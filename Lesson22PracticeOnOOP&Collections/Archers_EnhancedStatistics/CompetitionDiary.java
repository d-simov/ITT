package main;

import main.archers.Archer;
import main.archers.JuniorArcher;
import main.archers.SeniorArcher;
import main.archers.VeteranArcher;

import java.util.ArrayList;
import java.util.List;

public class CompetitionDiary {

    List<JuniorArcher> juniorList;
    List<SeniorArcher> seniorList;
    List<VeteranArcher> veteranList;


    public CompetitionDiary() {
        juniorList = new ArrayList<>();
        seniorList = new ArrayList<>();
        veteranList = new ArrayList<>();
    }

}
