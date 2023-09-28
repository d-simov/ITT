package Lesson12BinarySearch_QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassTask03QuickSortEnhancedArrayShuffle {

    public static void main(String[] args) {

        int[] arr = {5,7,10,11,14,16,18,19,23,26,27,29,34,36,37,41,45,48,49,50,52,54,55};
        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        disarrange(arr, rand, sc);
        System.out.println("\nDisarranged array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("\nArray after \"Quick Sort\": " + Arrays.toString(arr));

    }

    static void disarrange(int[] array, Random rand, Scanner sc) {
        int disarrangeTimes;
        do {
            System.out.print("Please, enter how many times would you like to shuffle the array: ");
            disarrangeTimes = sc.nextInt();
        } while (disarrangeTimes <= 0 || disarrangeTimes > 100);

        for (int i = 0; i < disarrangeTimes; i++) {
            int temp;
            for (int j = 0; j < array.length; j++) {
                int randomIdx = rand.nextInt(array.length);
                temp = array[randomIdx];
                array[randomIdx] = array[j];
                array[j] = temp;
            }
        }
    }
    static void quickSort(int[] arr, int start, int end){
        if(start >= end) {
            return;
        }
        int pivotIdx = partition(arr, start, end);
        quickSort(arr, start, end-1);
        quickSort(arr, start + 1, end);

    }

    static int partition(int[] arr, int start, int end){
        int pivotIdx = end;
        int startIdx = start;
        for (int i = start; i < end; i++) {
            if(arr[i] < arr[pivotIdx]){
                int temp = arr[startIdx];
                arr[startIdx] = arr[i];
                arr[i] = temp;
                startIdx++;
            }
        }
        int temp = arr[startIdx];
        arr[startIdx] = arr[pivotIdx];
        arr[pivotIdx] = temp;
        return startIdx;
    }

}
