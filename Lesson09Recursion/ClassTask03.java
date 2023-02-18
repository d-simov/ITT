package Lesson09Recursion;

public class ClassTask03 {

    public static void main(String[] args) {

        int[] arr = {5,8,2,9,4};

        int maxValue = findMax(arr, 0);
        System.out.println(maxValue + " - recursion");

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max + " - iteration");
        findMax1(arr[0],arr,0);
    }

    private static int findMax(int[] arr, int i) {
        if (i == arr.length -1){
            return arr[i];
        }
        return Math.max(arr[i], findMax(arr, i + 1));
    }

    static void findMax1(int max, int[] arr, int i){
        if (i == arr.length) {
            System.out.println(max + " - recursion from iteration");
            return;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        findMax1(max, arr, i+1);

    }
}
