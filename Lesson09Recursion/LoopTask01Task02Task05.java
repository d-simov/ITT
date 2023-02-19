package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask01Task02Task05 {

    public static void main(String[] args) {

        print(0, 100);
        System.out.println();
        print(-20, 50);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a number for a beginning of the growing sequence: ");
        int smallerNum = Integer.parseInt(sc.nextLine());
        System.out.print("Please, enter a number for an end of the growing sequence: ");
        int biggerNum = Integer.parseInt(sc.nextLine());

        if (biggerNum < smallerNum) {
            int temp = smallerNum;
            smallerNum = biggerNum;
            biggerNum = temp;
        }
        print(smallerNum, biggerNum);
    }

    static void print (int startNumber, int endNumber) {
        if (startNumber <= endNumber) {
            System.out.println(startNumber);
            print(startNumber + 1, endNumber);
        }
    }
}
