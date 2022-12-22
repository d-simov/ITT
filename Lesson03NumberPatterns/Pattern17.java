package Lesson03NumberPatterns;

import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {

        System.out.println("Please, enter the length of the side of the square:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number; j++) {
                if(i - j > 0){
                    System.out.print((i-j) + "  ");
                }
                else{
                    break;
                }
            }
            int n = 2;
            for (int k = number-i; k > 0; k--) {
                System.out.print(n + "  ");
                n++;
            }
            System.out.println();
        }
    }
}
