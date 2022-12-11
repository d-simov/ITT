package Lesson03Loops;

public class Task12 {

    public static void main(String[] args) {

        for (int i = 100; i <=999 ; i++) {
            int number = i;
            int digit3 = number % 10;
            number /= 10;
            int digit2 = number % 10;
            number /= 10;
            int digit1 = number % 10;

            if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {
                continue;
            }
            System.out.println(i);

        }

    }
}
