package main.Student;

public class College {

    public static void main(String[] args) {


        Student student1 = new Student("Peter", "Math", 23);
        Student student2 = new Student("George", "Biology", 32);
        Student student3 = new Student("Samuel", "Math", 19);
        Student student4 = new Student("Frank", "Chemistry", 22);
        Student student5 = new Student("Teodor", "Math", 25);
        Student student6 = new Student("Harris", "Chemistry", 27);
        Student student7 = new Student("Ron", "Math", 38);

        student1.setGrade(5);
        student3.setGrade(6);
        student6.setGrade(6);

        student1.receiveScholarship(5,500);
        student2.receiveScholarship(5,500);
        student3.receiveScholarship(4,250);
        student6.receiveScholarship(4,250);
        student7.receiveScholarship(4,250);

        student4.upYear();
        student4.upYear();
        student5.upYear();

        StudentGroup mathematicsGroup = new StudentGroup("Math");
        StudentGroup chemistryGroup = new StudentGroup("Chemistry");

        mathematicsGroup.addStudent(student1);
        mathematicsGroup.addStudent(student2);
        mathematicsGroup.addStudent(student3);
        mathematicsGroup.addStudent(student4);
        mathematicsGroup.addStudent(student5);
        mathematicsGroup.addStudent(student6);
        mathematicsGroup.addStudent(student7);
        chemistryGroup.addStudent(student1);
        chemistryGroup.addStudent(student4);
        chemistryGroup.addStudent(student5);
        chemistryGroup.addStudent(student6);

        mathematicsGroup.printStudentsGroup();
        System.out.println();
        chemistryGroup.printStudentsGroup();

        System.out.println("The best student in Math group is " + mathematicsGroup.theBestStudent());
        System.out.println("The best student in Chemistry group is " + chemistryGroup.theBestStudent());
    }
}
