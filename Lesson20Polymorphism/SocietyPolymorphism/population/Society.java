package main.PolimorphysmWithSociety.population;

public class Society {

    Town name;
    int numberOfFamiliesInTown;
    Family[] society;

    public Society (int familiesNumber) {
        if (familiesNumber > 10 && familiesNumber < 100) {
            this.numberOfFamiliesInTown = familiesNumber;
        } else {
            this.numberOfFamiliesInTown = 50;
        }
        society = new Family[this.numberOfFamiliesInTown];
        for (int i = 0; i < numberOfFamiliesInTown; i++) {
            society[i] = new Family();
        }
    }

}
