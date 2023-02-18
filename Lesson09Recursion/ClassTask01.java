package Lesson09Recursion;

public class ClassTask01 {

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 7};
        sumArray(0, arr1, 0);


    }

    static void sumArray(int arraySum, int[] arr, int i) {
        if (i == arr.length) {
            System.out.println(arraySum);
            return;
        }
        arraySum += arr[i];
        sumArray(arraySum, arr, i + 1);


    }
}

