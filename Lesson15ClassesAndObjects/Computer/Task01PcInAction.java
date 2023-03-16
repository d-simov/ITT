package Task04Computer;

public class Task01PcInAction {

    public static void main(String[] args) {

        Task01Computer hp = new Task01Computer();
        hp.year = 2019;
        hp.price = 435;
        hp.isNotebook = false;
        hp.hardDiskMemory = 500;
        hp.freeMemory = 124;
        hp.operationSystem = "Windows 10";

        Task01Computer acer = new Task01Computer();
        acer.year = 2021;
        acer.price = 819;
        acer.isNotebook = true;
        acer.hardDiskMemory = 1024;
        acer.freeMemory = 810;
        acer.operationSystem = "Windows 11";

        hp.useMemory(100);
        acer.changeOperationSystem("Linux");

        System.out.println("HP properties:\nYear: " + hp.year + ",\nPrice " + hp.price + " USD,\nIs notebook: " + hp.isNotebook + ",");
        System.out.println("HDD Capacity: " + hp.hardDiskMemory + " GB,\nFree memory: " + hp.freeMemory + " GB,\nOS: " + hp.operationSystem + ".");
        System.out.println();
        System.out.println("Acer properties:\nYear: " + acer.year + ",\nPrice " + acer.price + " USD,\nIs notebook: " + acer.isNotebook + ",");
        System.out.println("HDD Capacity: " + acer.hardDiskMemory + " GB,\nFree memory: " + acer.freeMemory + " GB,\nOS: " + acer.operationSystem + ".");
    }
}
