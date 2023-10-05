package archers.archers;

import archers.bows.Bow;

public abstract class Archer {

    private String name;
    private int age;
    private char gender;
    private Bow bow;
    private int experience;
    private int tournaments = 0;
    private int points = 0;
    private int misses = 0;
    private int bullsEyes = 0;

    public Archer(String name, int age, char gender, Bow bow, int experience) {
        //TODO validate
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bow = bow;
        if(validExp(experience)) {
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    abstract boolean validExp(int exp);

    @Override
    public String toString() {
        return name + " (" + age + "yo) with " + experience + " years in the field. Points = " + points + " ( misses = " + misses + " and bullseye = "+bullsEyes+")";
    }

    public void incrementTournamentsCount(){
        this.points = 0;
        this.misses = 0;
        this.tournaments++;
    }

    public int getPoints() {
        return points;
    }

    public int getMisses() {
        return misses;
    }

    public String getName() {
        return name;
    }

    public int shootArrows(){
        int points = 0;
        for (int i = 0; i < getArrowCount(); i++) {
            points += getArrowPoints();
        }
        return points;
    }

    public Bow getBow() {
        return bow;
    }

    protected abstract int getArrowPoints();

    protected abstract int getArrowCount();

    public void setPoints(int points){
        this.points = points;
    }

    public void incrementMisses(){
        this.misses++;
    }

    public void incrementBullsEyes(){
        this.bullsEyes++;
    }

    public int getBullsEyes() {
        return bullsEyes;
    }

    public boolean isFemale(){
        return gender == 'F';
    }
}
