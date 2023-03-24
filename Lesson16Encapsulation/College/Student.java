package main.Student;

public class Student {

    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double money;
    private final double minGrade = 2;
    private final double maxGrade = 6;

    private Student() {
        this.grade = 4;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    public Student(String name, String subject, int age) {
        this();
        if (name.trim().length() > 1) {
            this.name = name;
        }
        if (subject.trim().length() > 1) {
            this.subject = subject;
        }
        if (age > 17 && age < 100) {
            this.age = age;
        }
    }

    void upYear() {
        if (!this.isDegree) {
            this.yearInCollege++;
        }
        if (yearInCollege == 4) {
            this.isDegree = true;
        }
    }

    double receiveScholarship(double min, double amount){
        if(this.age < 30 && this.grade >= min) {
            this.money += amount;
        }
        return this.money;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= minGrade && grade <= maxGrade) {
            this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", subject = '" + subject + '\'' +
                ", grade = " + grade +
                ", yearInCollege = " + yearInCollege +
                ", age = " + age +
                ", isDegree = " + isDegree +
                ", money = " + money +
                '}';
    }
}
