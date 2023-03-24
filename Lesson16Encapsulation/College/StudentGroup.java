package main.Student;

public class StudentGroup {

    private String groupSubject;
    private Student[] students;
    private int freePlaces;

    StudentGroup() {
        students = new Student[5];
        freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        if (subject.trim().length() > 1) {
            this.groupSubject = subject;
        }
    }

    void addStudent(Student s) {
        if (s.getSubject().equals(this.groupSubject) && this.freePlaces > 0) {
            for (int i = 0; i < this.students.length; i++) {
                if (this.students[i] == null) {
                    this.students[i] = s;
                    break;
                }
            }
            this.freePlaces--;
        }
    }

    void emptyGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    String theBestStudent() {
        Student bestStudent = this.students[0];
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null && (this.students[i].getGrade() > bestStudent.getGrade())) {
                bestStudent = this.students[i];
            }
        }
        return bestStudent.getName();
    }

    void printStudentsGroup() {
        System.out.println("List of students' group in " + this.groupSubject + ":");
        for (int i = 0; i < this.students.length; i++) {
            System.out.println(this.students[i]);
        }
    }
}
