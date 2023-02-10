package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task04_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the three names of two people. Name 1 and Name 2 - separated by comma: ");
        String[] names = sc.nextLine().split(",");
        String name1 = names[0].trim();
        String name2 = names[1].trim();

        int sumName1 = 0;
        int sumName2 = 0;

        for (int i = 0; i < name1.length(); i++) {
            sumName1 += name1.charAt(i);
        }
        for (int i = 0; i < name2.length(); i++) {
            sumName2 += name2.charAt(i);
        }
        System.out.println(sumName1 > sumName2 ? name1 : name2);

    }

}
