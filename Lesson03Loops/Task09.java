package Lesson03Loops;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете две цели числа, разделени с интервал:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <=b ; i++) {
            if (i % 3 == 0) {
                System.out.print("skip 3, ");
                continue;
            }
            else {
                if (i == b) {
                    System.out.print(i*i);
                }
                else {
                    System.out.print(i * i + ", ");
                    sum += (i * i);
                }
            }
            if (sum > 200) {
                System.out.println("Сумата на изведените числа стана по-голяма от 200. Приятен ден!");
                break;
            }
        }
    }
}
