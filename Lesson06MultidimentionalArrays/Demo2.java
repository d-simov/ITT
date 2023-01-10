public class Demo2 {

    public static void main(String[] args) {

        float[] arr = {-1.12F, -2.43F, 3.1F, 4.2F, 0, 6.4F, - 7.5F, 8.6F, 9.1F, -4};

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < -0.231){
                arr[i] = 41.25F + (i+1)*(i+1);
            }
            else{
                arr[i] *= (i+1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
