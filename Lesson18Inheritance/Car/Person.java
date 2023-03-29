package main;

public class Person {

    String name;
    int age;
    private char gender;
    Person friend;

    void setGender (char gender) {
        if (gender == 'm' || gender == 'M') {
            this.gender = 'm';
        } else if (gender == 'f' || gender == 'F') {
            this.gender = 'f';
        }
        else {
            System.out.println("The gender is not yet specified (M/F).");
        }
    }

    char getGender() {
        return gender;
    }
}
