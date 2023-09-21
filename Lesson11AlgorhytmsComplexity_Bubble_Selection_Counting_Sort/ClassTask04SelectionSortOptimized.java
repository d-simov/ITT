package Lesson11AlgorhytmsComplexity_Bubble_Selection_Counting_Sort;

public class ClassTask04SelectionSortOptimized {

    /*
    В оптимизирания вариант за една итерация освен минималния, намираме и максималния елемент и поставяма и него на
    мястото му. По този начин сложноста остава квадратична, но се съкращава 4 пъти (N^2/4). При стандартния
    Selection Sort сложността е квадратична, съкратена наполовина (n^2/2).
     */

    public static void main(String[] args) {
        int[] arr = {7,4,6,1,3};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }


    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void selectionSort (int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int minIndex = i;
            int maxIndex = i;
            for (int j = i + 1; j < array.length - i; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            if (maxIndex == i) {
                maxIndex = minIndex;
            }
            temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[maxIndex];
            array[maxIndex] = temp;

        }
    }


}
