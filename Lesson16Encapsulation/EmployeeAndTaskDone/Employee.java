package main.Employee_Task;

public class Employee {

    private String name;
    private Task currentTask;
    private int hoursLeft;

    Employee(String name) {
        if (name.trim().length() > 1) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length() > 1) {
            this.name = name;
        }
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        if (currentTask != null) {
            this.currentTask = currentTask;
            System.out.println("\n" + this.name + "'s current task is now \"" + this.currentTask.getName() + "\" and has "
                    + currentTask.getWorkingHours() + " hours left until it's done.");
        }
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft >= 0 && hoursLeft <= 8) {
            this.hoursLeft = hoursLeft;
        }
    }

    void work() {
        System.out.println("In the beginning of the work " + this.name + " has " + this.hoursLeft +
                " working hours left from the working day and has " + this.currentTask.getWorkingHours() +
                " hours until he gets his current task done.");
        if (this.currentTask != null) {
            if (this.hoursLeft > this.currentTask.getWorkingHours()) {
                this.hoursLeft -= this.currentTask.getWorkingHours();
                this.currentTask.setWorkingHours(0);
            } else if (this.hoursLeft < this.currentTask.getWorkingHours()) {
                this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - hoursLeft);
                this.hoursLeft = 0;
            } else {
                this.hoursLeft = 0;
                this.currentTask.setWorkingHours(0);
            }
        }
        System.out.println("By the end of the work " + this.name + " has " + this.hoursLeft +
                " working hours left from the working day and has " + this.currentTask.getWorkingHours() +
                " hours until he gets his current task done.\n");
    }

    @Override
    public String toString() {
        return "Employee info: {" +
                "name - '" + name + '\'' +
                ", current task = " + currentTask.getName() +
                ", hours left from working day = " + hoursLeft +
                ", hours left from the task - " + this.currentTask.getWorkingHours() +
                '}';
    }
}
