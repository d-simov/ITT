package Task04Computer;

public class PcInAction {

    public static void main(String[] args) {

        Computer hp = new Computer();
        hp.year = 2019;
        hp.price = 435;
        hp.isNotebook = false;
        hp.hardDiskMemory = 500;
        hp.freeMemory = 124;
        hp.operationSystem = "Windows 10";

        Computer acer = new Computer();
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

        System.out.println("\nLesson 16: Encapsulation");

        Computer office01 = new Computer(2015, 500, 500, 300);
        Computer office05 = new Computer(2019, 850, true, 1024,620,"Win11");

        if (office01.comparePrice(office05) > 0) {
            System.out.println(office01.operationSystem + " - " + office01.year + " is cheaper than " + office05.operationSystem + " - " + office05.year);
        } else if (office01.comparePrice(office05) < 0) {
            System.out.println(office01.operationSystem + " - " + office01.year + " is more expensive than " + office05.operationSystem + " - " + office05.year);
        } else {
            System.out.println(office01.operationSystem + " - " + office01.year + " costs as much as " + office05.operationSystem + " - " + office05.year);
        }
    }
}
