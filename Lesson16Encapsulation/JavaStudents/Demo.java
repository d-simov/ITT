package JavaStudents;

public class Demo {

    public static void main(String[] args) {

        Course java1 = new Course(Subject.JAVA, 20);
        java1.showNumberOfStudentsInClass();
        java1.getStudentsInfo();
        java1.startExam();
        java1.showNumberOfStudentsInClass();
        java1.getStudentsInfo();
    }

}
