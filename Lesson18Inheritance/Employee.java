package main;

public class Employee extends Person {

    private double daySalary;

    Employee (String name, int age, char gender, int daySalary) {
        super (name, age, gender);
        if (daySalary > 0) {
            this.daySalary = daySalary;
        }
    }

    double calculateOvertime (double hours) {
        if (this.getAge() < 18) {
            return 0;
        }
        else {
            return this.daySalary / 8 * 1.5 * hours;
        }
    }

    public void showEmployeeInfo() {
        System.out.print("This employee, named " + this.getName() + " is ");
        switch (this.getGender()) {
            case 'm' -> System.out.print("male");
            case 'f' -> System.out.print("female");
            default -> System.out.print("with unidentified gender ");
        }
        System.out.println(" and on the age of " + this.getAge() + " with salary of " + this.daySalary + " per day.");
    }

    public double getDaySalary() {
        return daySalary;
    }
}
