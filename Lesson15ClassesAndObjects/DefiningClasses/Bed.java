package Task00TrainingClasses;

public class Bed {

    String type;
    String name;
    char size;
    int length;
    int width;
    int numberOfPillows;
    String sheetColour;
    boolean hasChest;
    Person[] owners;

    void setLength(int sm){
        if (sm != 190 || sm !=200) {
            System.out.println("Legit bed length is 190 sm or 200 sm");
        }
        else {
            length = sm;
        }
    }
}
