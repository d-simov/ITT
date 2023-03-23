package main.Employee_Task;

public class Task {

    private String name;
    private int workingHours;

    public Task(String name, int workingHours) {
        if (name.trim().length() > 0) {
            this.name = name;
        }
        if (workingHours > 0) {
            this.workingHours = workingHours;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length() > 0) {
            this.name = name;
        }
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        if (workingHours >= 0) {
            this.workingHours = workingHours;
        }
    }
}
