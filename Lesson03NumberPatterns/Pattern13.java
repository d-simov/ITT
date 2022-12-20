package Lesson03NumberPatterns;

public class Pattern13 {

    public static void main(String[] args) {

        int n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(n + " ");
                if (n < 10) {
                    System.out.print(" ");
                }
                n++;
            }
            System.out.println();
        }
    }
}
