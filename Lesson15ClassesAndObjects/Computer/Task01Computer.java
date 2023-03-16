package Task04Computer;

public class Task01Computer {

    int year;   // year of production
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOS) {
        operationSystem = newOS;
    }

    int useMemory(int usedMemory){
        if (usedMemory < freeMemory) {
            return freeMemory -= usedMemory;
        }
        else {
            System.out.println("Not enough free memory for that action.");
            return freeMemory;
        }
    }


}
