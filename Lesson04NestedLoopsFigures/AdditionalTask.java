package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class AdditionalTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Моля, въведете цяло, положително число:");
            int number = sc.nextInt();
       while (number <= 0) {
           System.out.println("Моля, въведете ново число и хайде този път да е положително!");
           number = sc.nextInt();
       }
       int result = 1;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0){
                result *= i;
            }
        }
        System.out.println(result);

    }
}
