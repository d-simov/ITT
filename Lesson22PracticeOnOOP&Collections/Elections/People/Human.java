package main.people;

import java.util.Random;

public abstract class Human implements Comparable<Human> {

    protected enum Gender {
        MALE, FEMALE;
    }

    protected String name;
    protected Gender gender;
    private static long firstEGN = 8101011702L;
    private final String EGN;
    private String[] firstFemaleNames = {"Emma", "Olivia", "Ava", "Isabella", "Sophia", "Mia", "Charlotte", "Amelia", "Evelyn", "Abigail",
            "Harper", "Emily", "Elizabeth", "Avery", "Sofia", "Ella", "Madison", "Scarlett", "Grace", "Chloe",
            "Lily", "Aria", "Zoey", "Riley", "Nora", "Lila", "Hailey", "Lucy", "Emma", "Aubrey",
            "Layla", "Kinsley", "Nova", "Hannah", "Lily", "Addison", "Eleanor", "Natalie", "Luna", "Savannah",
            "Brooklyn", "Leah", "Zoe", "Stella", "Aurora", "Hazel", "Ellie", "Violet", "Aria", "Scarlett"};
    private String[] firstMaleNames = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Charles", "Thomas",
            "Christopher", "Daniel", "Matthew", "George", "Anthony", "Donald", "Paul", "Mark", "Edward", "Brian",
            "Ronald", "Kenneth", "Steven", "Andrew", "Kevin", "Jason", "Jeffrey", "Gary", "Timothy", "Jose",
            "Larry", "Frank", "Scott", "Eric", "Stephen", "Jerry", "Dennis", "Walter", "Patrick", "Peter", "Harold",
            "Douglas", "Henry", "Carl", "Arthur", "Ryan", "Roger", "Joe", "Juan", "Jack"};
    private String[] middleNames = {"Grace", "Rose", "Elizabeth", "Anne", "Marie", "Jane", "Louise", "Catherine", "Alexandra", "Victoria",
            "Faith", "Hope", "Joy", "Taylor", "Morgan", "Paige", "Rae", "Lynn", "Lee", "Quinn",
            "Brooke", "Skye", "Jade", "Evelyn", "Claire", "Nicole", "Taylor", "Jordan", "Lynn", "Reese",
            "Shea", "Blake", "Taylor", "Marie", "Kai", "Sage", "Jordan", "Drew", "Morgan", "Avery",
            "Ryan", "Cameron", "Taylor", "Blake", "Reese", "Morgan", "Bailey", "Casey", "Alexis", "Marie", "Paige", "Rae", "Grace", "Lynn", "Eve", "Brooke", "Faith", "Noelle", "Joy",
            "Quinn", "Beth", "Mae", "Rose", "Claire", "Nicole", "Shay", "Alexis", "Taylor", "June",
            "Jade", "Lane", "Leigh", "Morgan", "Skye", "Sloane", "Avery", "Blair", "Dylan", "Reese",
            "Harper", "Jordan", "Sage", "Casey", "Serenity", "Taylor", "Wren", "Drew", "Peyton", "Piper",
            "Kai", "Shea", "Alexandra", "Quincy", "Holland", "London", "Sawyer", "Mackenzie", "Emerson", "Ainsley",
            "Jordan"};
    private String[] lastNames = {"Anderson", "Thompson", "Mitchell", "Hayes", "Reynolds", "Lawson", "Crawford",
            "Foster", "Anderson", "Palmer", "Harrison", "Roberts", "Wright", "Nelson", "Bennett", "Sullivan", "White",
            "Parker", "Richardson", "Hughes", "Jenkins", "Taylor", "Johnson", "Carter", "Foster", "Williams", "Turner",
            "Collins", "Murphy", "Mitchell", "Thompson", "Baker", "Adams", "Turner", "Edwards", "Harris", "Hall",
            "Stewart", "Reed", "Mitchell", "Cooper", "Clark", "Harris", "Parker", "Bennett", "Turner", "Wood",
            "Walker", "Murphy", "Turner"};
    protected Human() {
     this.gender = (Util.getRandomBoolean()? Gender.MALE : Gender.FEMALE);
        this.name = (this.gender == Gender.MALE ? getName(firstMaleNames) : getName(firstFemaleNames)) +
                " " + getName(middleNames) + " " + getName(lastNames);
        this.EGN = ""+firstEGN;
        firstEGN++;
    }

    @Override
    public int compareTo(Human other) {
        if (this.getName().compareTo(other.getName()) != 0) {
            return this.getName().compareTo(other.getName());
        } else {
            return this.EGN.compareTo(other.getEGN());
        }
    }

    private String getName(String[] arrayOfNames) {
        return arrayOfNames[Util.getRandomNumber(0, arrayOfNames.length - 1)];
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public String getEGN() {
        return EGN;
    }
}
