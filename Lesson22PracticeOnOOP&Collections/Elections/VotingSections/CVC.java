package main.VotingSections;

import main.City;
import main.People.voters.Voter;

import java.util.ArrayList;
import java.util.HashMap;

public class CVC {

    public static final int NUMBER_OF_CANDIDATES = 10;
    private static HashMap<String, LVC> localSections;
    CVC () {
        for (int i = 0; i < City.values().length; i++) {
            String town = City.getNextCity().name();
            localSections.put(town, new LVC(town));
        }
    }

    public static HashMap<String, LVC> getLocalSections() {
        return localSections;
    }

    public static void startElections() {
//        ENTER SOME CODE HERE;
    }
}
