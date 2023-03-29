package main.PersonWithARole;

public class Demo {

    public static void main(String[] args) {

        Person[] persons = new Person[10];

        Person pesho = new Person("Petar", 30, 'm');
        Person gosho = new Person("Georgi", 31, 'm');

        Student mimiStudent = new Student("Mariya", 20, 'f', 5.65);
        Student miroStudent = new Student("Miroslav", 21, 'z', 3.14);

        Employee kiroWorker = new Employee("Kiril", 52, 'm', 80);
        Employee spiroWorker = new Employee("Spiro", 17, 'm', 50);

        persons[1] = pesho;
        persons[2] = gosho;
        persons[3] = mimiStudent;
        persons[4] = miroStudent;
        persons[5] = kiroWorker;
        persons[6] = spiroWorker;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                if (persons[i].getClass() == Employee.class) {
                    ((Employee) persons[i]).showEmployeeInfo();
                }
                else if (persons[i].getClass() == Student.class) {
                    ((Student) persons[i]).showStudentInfo();
                }
                else {
                    persons[i].showPersonInfo();
                }
            }
        }
        System.out.println("* * *");
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                if (persons[i].getClass() == Employee.class) {
                    System.out.println(persons[i].getName() + " is owed " + ((Employee) persons[i]).calculateOvertime(2)
                            + " BGN overpayment.");
                }
            }
        }
    }
}
