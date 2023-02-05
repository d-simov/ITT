package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks02 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter your full name: ");
        String[] names = ((sc.nextLine().trim()).split(" "));

        for (int i = 0; i < names.length; i++) {
            System.out.print((names[i].toUpperCase()).charAt(0));
        }
    }
}
