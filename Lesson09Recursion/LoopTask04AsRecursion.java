package Lesson09Recursion;

public class LoopTask04 {


    public static void main(String[] args) {

        print(10);
    }

    static void print(int number) {
        if (number > 0) {
            System.out.println(number);
            number--;
            print(number);
        }

    }
}
