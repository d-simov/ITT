package main.PersonWithARole;

public class Person {

    private final String name;
    private int age;
    private char gender;

    Person(String name, int age, char gender) {
        if (name.trim().length() > 1) {
            this.name = name;
        }
        else {
            this.name = "Unnamed";
        }
        if (age > 0 && age < 115) {
            this.age = age;
        } else {
            this.age = 0;
        }
        switch (gender) {
            case 'm' -> this.gender = 'm';
            case 'f' -> this.gender = 'f';
            default -> this.gender = '0';
        }
    }

    public void showPersonInfo() {
        System.out.print("This person, named " + this.name + " is ");
        switch (this.gender) {
            case 'm' -> System.out.print("male");
            case 'f' -> System.out.print("female");
            default -> System.out.print("with unidentified gender ");
        }
        System.out.println(" and on the age of " + this.age + ".");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age && age < 115) {
            this.age = age;
        }
    }

    public char getGender() {
        return gender;
    }

}
