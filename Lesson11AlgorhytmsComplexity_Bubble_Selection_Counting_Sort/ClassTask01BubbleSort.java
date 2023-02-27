package Lesson11AlgorhytmsComplexity_Bubble_Selection_Counting_Sort;

public class ClassTask01BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4,1,7,3,9,4,7,2};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] array) {
        for (int times = 0; times < array.length; times++) {
            for (int i = 0; i < array.length - 1 - times; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
