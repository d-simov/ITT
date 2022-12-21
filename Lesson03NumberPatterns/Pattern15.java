package Lesson03NumberPatterns;

public class Pattern15 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) <= 5){
                    System.out.print((i + j) + " ");
                }
                else {
                    System.out.print(5 + " ");
                }
            }
            System.out.println();
        }
    }
}
