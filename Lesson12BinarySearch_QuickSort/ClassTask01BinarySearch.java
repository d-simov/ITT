package Lesson12BinarySearch_QuickSort;

import java.util.Random;

public class ClassTask01BinarySearch {

    public static void main(String[] args) {

        int[] arr = {5,7,10,11,14,16,18,19,23,26,27,29,34,36,37,41,45,48,49,50,52,54,55};
        Random r = new Random();
        int x = r.nextInt(arr[arr.length-1] - arr[0]) + arr[0];

        System.out.printf("The index of element \"%d\" is \'%d\'.", x, binarySearch(arr, x, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int x, int start, int end) {
        if(start > end) {
            return -1;
        }
        int midIdx = (start + end) / 2;
        if(x == arr[midIdx]) {
            return midIdx;
        }
        else if(x > arr[midIdx]) {
            return binarySearch(arr, x, midIdx+1, end);
        }
        else {
            return binarySearch(arr, x, start, midIdx-1);
        }
    }
}
