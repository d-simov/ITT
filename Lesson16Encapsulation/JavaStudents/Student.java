package JavaStudents;

import java.util.Random;

public class Student {

    private String name;
    private Subject subject;
    private int theoryGrade;
    private int practiceGrade;

    Student () {
        String[] names = {"Pesho", "Gosho", "Petya", "Fifi", "Sisi", "Gencho", "Pencho", "Atanas", "Dora"};
        this.name = names[new Random().nextInt(names.length)];
    }

    void takeExam(Subject subject) {
        if (subject == this.subject) {
            this.theoryGrade = new Random().nextInt(101);
            this.practiceGrade = new Random().nextInt(101);
        } else {
            System.out.println( subject + " is a different subject. " + this.name + " actually studies " + this.subject
                    + ".");
        }
    }



    boolean passExam () {
        return (this.theoryGrade >= 50 && this.practiceGrade >= 50);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    void getInfo() {
        if (this != null) {
            System.out.println(this.name + " is studying " + this.subject + " and has " + this.theoryGrade + " on theory and "
             + this.practiceGrade + " on practice.");
        } else {
            System.out.println("No such student in this class.");
        }
    }

    public String getName() {
        return name;
    }
}
