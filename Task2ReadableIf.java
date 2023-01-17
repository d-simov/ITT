package Lesson07PracticeOnArrays;

public class Task2ReadableIf {

    public static void main(String[] args) {

        int[] array = {34,2,65,7,50,2,345,6,234,1};

        boolean isZigzag = true;
        for (int i = 1; i < array.length - 2; i++) {
            boolean isGreaterThanNeighbours = array[i] > array[i+1] && array[i] > array[i-1];
            boolean isSmallerThanNeighbours = array[i] < array[i+1] && array[i] < array[i-1];
            if ( ! (isGreaterThanNeighbours || isSmallerThanNeighbours)) {
                isZigzag = false;
            }
        }
        System.out.print(isZigzag ? "Array is zig-zag." : "Array is NOT zig-zag.");
    }

}
