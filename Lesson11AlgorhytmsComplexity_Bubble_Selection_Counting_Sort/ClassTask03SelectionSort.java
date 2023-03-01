package Lesson11AlgorhytmsComplexity_Bubble_Selection_Counting_Sort;

public class ClassTask03SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4,1,7,3,9,4,7,2};
        ClassTask02BubbleSortOptimized.printArray(arr);
        selectionSort(arr);
        ClassTask02BubbleSortOptimized.printArray(arr);
    }

    static void selectionSort (int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
