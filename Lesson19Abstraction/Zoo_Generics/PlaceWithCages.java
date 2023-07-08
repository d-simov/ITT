package main.Zoo_Generics;

public class PlaceWithCages {

    protected String name;
    protected String address;

    protected Cage[] cages;

    PlaceWithCages (int numberOfCages) {
        if (numberOfCages > 0 && numberOfCages < 1000) {
            cages = new Cage[numberOfCages];
        } else {
            cages = new Cage[50];
        }
    }
}
