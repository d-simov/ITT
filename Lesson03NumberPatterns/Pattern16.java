package Lesson03NumberPatterns;

public class Pattern16 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <=5 ; j++) {
                if ((i + j) <= 5) {
                    System.out.print((i + j) + " ");
                } else {
                    break;
                }
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}
