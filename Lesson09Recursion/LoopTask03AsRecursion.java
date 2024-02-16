package Lesson09Recursion;

public class LoopTask03 {

    public static void main(String[] args) {

        print(-10, 10);

    }

    static void print(int num1, int num2) {
        if (num1 <= num2) {
            System.out.println(num1);
            print(num1 + 1, num2);
        }
    }
}
