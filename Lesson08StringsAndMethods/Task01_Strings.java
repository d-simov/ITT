package Lesson08StringsAndMethods;

public class Task01_Strings {

    public static void main(String[] args) {

        String text = "Програмирането е изкуство на мисълта.";

        int ePosition = text.indexOf('е');
        int isPosition = text.indexOf("е");

        System.out.println(ePosition);
        System.out.println(isPosition);
    }



}
