package Lesson08StringsAndMethods;

public class Task13_Methods {

    public static void main(String[] args) {

        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {6,7,8,9,10};

        int[] bigArray = concatenateArrays(firstArray, secondArray);
        Task12_Methods.printArray(bigArray);
    }

    static int[] concatenateArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < (array1.length + array2.length); i++) {
            array3[i] = array2[i - array1.length];
        }
        return array3;
    }
}
