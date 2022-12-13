package Lesson03Loops;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете две естествени от интервала [10..5555], разделени с интервал:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n >= m) {
            for (int i = n; i >= m; i--) {
                if (i % 50 == 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            for (int i = m; i >= n; i--) {
                if (i % 50 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
