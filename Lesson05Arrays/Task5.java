package Lesson05Arrays;

public class Task5 {


    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[10];

        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i*3;
            if (i == arrayOfNumbers.length - 1) {
                System.out.print(arrayOfNumbers[i]);
            }
            else {
                System.out.print(arrayOfNumbers[i] + ", ");
            }
        }
        System.out.println("]");

    }

}
