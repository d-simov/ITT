package main.archers;

import main.bows.Bow;

import java.util.Random;

public abstract class Archer {

    private String name;
    private final Gender archerGender;
    private int age;
    private Bow bow;
    private int experienceInYears;
    private int tournaments = 0;
    private int maxArrows = 0;
    protected int currentResult = 0;
    protected int misses = 0;
    private static final String[] maleNames = {"Ivan", "Gosho", "Krasi", "Pesho", "Stefan", "Evgeni", "Stamat", "Sasho",
            "Kiro", "Spiro", "Miro", "Evstati", "Konstantin", "Mitko", "Plamen", "Krasi", "Dido"};
    private static final String[] femaleNames = {"Fani", "Jeni", "Mimi", "Reni", "Rumi", "Fifi", "Bibi", "Julia",
            "Anna", "Stasi", "Fani", "Stela", "Kati", "Andi", "Sofia"};

    public Archer(int experienceInYears) {
        this.archerGender = ((new Random().nextBoolean())? Gender.MALE: Gender.FEMALE);
        if (validExperience(experienceInYears)) {
            this.experienceInYears = experienceInYears;
        }
        if (this.archerGender == Gender.MALE) {
            this.name = maleNames[new Random().nextInt(maleNames.length)];
        } else {
            this.name = femaleNames[new Random().nextInt(femaleNames.length)];
        }
        this.age = (new Random().nextInt(41 - experienceInYears) + (12 + experienceInYears));

    }

    abstract boolean validExperience(int experience);

    public void getInfo() {
        System.out.println(this.name + " is " + this.age + " years old " + this.getClass().getSimpleName() + ", has " + this.experienceInYears +
                " years experience and shoots with " + bow.getClass().getSimpleName() + ". ");
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void shootArrows() {
        System.out.println(" ---------- IT IS " + this.name + "'s TURN. ---------- ");
        for (int i = 0; i < this.maxArrows; i++) {
            this.currentResult += getPoints();
        }
        System.out.println(this.name + " GOT " + currentResult + " POINTS FROM THE TOURNAMENT.\n");
    }

    protected abstract int getPoints();

    public void incrementParticipationCount () {
        this.tournaments++;
    }

    protected void setMaxArrows(int maxArrows) {
        this.maxArrows = maxArrows;
    }

    public Bow getBow() {
        return bow;
    }

    protected abstract boolean successfulShot();

    protected int getPointsForNonBeginners(){
        if (successfulShot()) {
            int points = (new Random().nextInt(5) + 6) + this.getBow().getBonusPoints();
            if (points <= 10) {
                System.out.println(this.getName() + " (" + this.getClass().getSimpleName() + "-" + this.age +  ") hit " + points + ".");
                return points;
            } else {
                System.out.println(this.getName() + " (" + this.getClass().getSimpleName() + "-" + this.age +  ") hit 10.");
                return 10;
            }
        } else {
            incrementMisses();
            System.out.println(this.getName() + " (" + this.getClass().getSimpleName() + "-" + this.age +  ") missed.");
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void incrementMisses() {
        this.misses++;
    }

    public void setCurrentResult(int currentResult) {
        this.currentResult = currentResult;
    }

    public void setMisses(int misses) {
        this.misses = misses;
    }

    public int getCurrentResult() {
        return currentResult;
    }
}

