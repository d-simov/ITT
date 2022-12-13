package Lesson03Loops;

public class Task20 {

    public static void main(String[] args) {
        int number = 1;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if ((number + i) > 9) {
                    number = -i;
                }
                System.out.print((number + i) + "  ");
                number++;
            }
            System.out.println();
        }
    }
}
