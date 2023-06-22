package JavaStudents;

public class Course {

    public static final int MIN_STUDENT_GROUP_SIZE = 5;
    public static final int MAX_STUDENT_GROUP_SIZE = 100;
    public static final int DEFAULT_STUDENT_GROUP_SIZE = 25;
    private Subject subject;
    private int numberOfStudents;
    private Student[] students;

    public Course(Subject subject, int numberOfStudents) {
        this.subject = subject;
        if (numberOfStudents >= MIN_STUDENT_GROUP_SIZE && numberOfStudents <= MAX_STUDENT_GROUP_SIZE) {
            this.numberOfStudents = numberOfStudents;
        } else {
            this.numberOfStudents = DEFAULT_STUDENT_GROUP_SIZE;
        }
        students = new Student[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setSubject(this.subject);
        }
    }

    void startExam () {
        System.out.println("\nThe exam is starting.\n...................................................");
        for (int i = 0; i < students.length; i++) {
            students[i].takeExam(this.subject);
            if(!students[i].passExam()) {
                students[i] = null;
            }
        }
        System.out.println("The exam is over.\n");
    }

    void getStudentsInfo () {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].getInfo();
            }
        }
    }

    void acceptStudent (Student s) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = s;
                System.out.println("Student " + s.getName() + " is accepted on seat " + i + ".");
                return;
            }
        }
        System.out.println("There is no place for student " + s.getName() + " in the " + this.subject + " class. ");
    }

    void goHome(int studentID) {
        students[studentID] = null;
    }
    void showNumberOfStudentsInClass() {
        int counter = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (students[i] != null) {
                counter++;
            }
        }
        System.out.println(counter + " students in the class of " +  this.subject + " now.");
    }
}
