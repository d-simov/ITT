package main.Employee_Task;

public class EmployeeTaskDemo {

    public static void main(String[] args) {

        Employee pesho = new Employee("Пепеляшко");
        pesho.setHoursLeft(8);


        Task cepene = new Task("нацепи камъни за огнището", 5);
        Task lepene = new Task("и утре е ден...", 7);
        pesho.setCurrentTask(cepene);

        pesho.toString();
        pesho.work();
        System.out.println(pesho);
        pesho.setCurrentTask(lepene);
        pesho.work();
        System.out.println(pesho);


    }
}
