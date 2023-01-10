public class Demo {

    public static void main(String[] args) {

        int[] arr = {5,5,5,4,4,4,4,2,3,2,2,3,3,3,2,32,2,2,2,2,22,1,1,1,2,2,2,2,2,1,1,1,1,1,1,11,4,5,5,5,5,5,55,5,6,1};

        int counted = arr[0];
        int count = 1;

        int currentCount = 1;
        int currentCounted = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] == arr[i]){
                currentCount++;
                if(currentCount > count){
                    count = currentCount;
                    counted = currentCounted;
                }
            }
            else{
                currentCounted = arr[i+1];
                currentCount = 1;
            }
        }

        System.out.printf("Longest sequence is %d of %d", count, counted);
    }
}
