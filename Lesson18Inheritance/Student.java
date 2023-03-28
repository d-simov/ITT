package main;

public class Student extends Person {

    private double score;

    Student (String name, int age, char gender, double score) {
        super(name, age, gender);
        if (score >= 2 && score <= 6) {
            this.score = score;
        }
    }

    public void showStudentInfo() {
        System.out.print("This student, named " + this.getName() + " is ");
        switch (this.getGender()) {
            case 'm' -> System.out.print("male");
            case 'f' -> System.out.print("female");
            default -> System.out.print("with unidentified gender ");
        }
        System.out.println(" and on the age of " + this.getAge() + " with score of " + this.score + ".");
    }
}
