package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks06 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length;
        do{
            System.out.print("Please, enter a positive number for length of the array: ");
            length = sc.nextInt();
        } while (length <= 0);

        String[] stringArray = new String[length];
        System.out.println("Please, enter a word to fill the array with: ");
        String singleString = sc.nextLine();

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = singleString;
        }
        StringBuilder bigString = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            bigString.append(stringArray[i]);
        }
        System.out.println();
        System.out.println(bigString);
    }
}
