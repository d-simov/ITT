package Task04Computer;

public class Computer {

    int year;   // year of production
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

   Computer (){
        isNotebook = false;
        operationSystem = "WinXP";
    }

    Computer (int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        if (year > 1990 && year <= 2023) {
            this.year = year;
        }
        if (price > 10 && price < 100000) {
            this.price = price;
        }
        if (hardDiskMemory > 100) {
            this.hardDiskMemory = hardDiskMemory;
        }
        if (freeMemory > 50) {
            this.freeMemory = freeMemory;
        }
    }

    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        if (year > 1990 && year <= 2023) {
            this.year = year;
        }
        if (price > 10 && price < 100000) {
            this.price = price;
        }
        if (hardDiskMemory > 100) {
            this.hardDiskMemory = hardDiskMemory;
        }
        if (freeMemory > 50) {
            this.freeMemory = freeMemory;
        }
        if (operationSystem.equalsIgnoreCase("WinXp") || operationSystem.equalsIgnoreCase("Win10") ||
                operationSystem.equalsIgnoreCase("Win11") || operationSystem.equalsIgnoreCase("Linux")) {
            this.operationSystem = operationSystem;
        }
        this.isNotebook = isNotebook;
    }

    void changeOperationSystem(String newOS) {
        operationSystem = newOS;
    }

    double useMemory(double usedMemory){
        if (usedMemory < freeMemory) {
            return freeMemory -= usedMemory;
        }
        else {
            System.out.println("Not enough free memory for that action.");
            return freeMemory;
        }
    }

    int comparePrice(Computer c) {
        if (this.price > c.price) {
            return -1;
        }
        else if (this.price < c.price) {
            return 1;
        }
        else {
            return 0;
        }
    }


}
