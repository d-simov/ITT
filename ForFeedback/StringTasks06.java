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
// Краси, защо sc.nextLine(); на ред20 не паузира изпълнението на програмата, а присвоява на низа празна стойност ("") 
// и програмата продължава изпълнение без да съм въвел нищо? При sc.next() работи за първата дума, но в този вариант - не!?!
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
