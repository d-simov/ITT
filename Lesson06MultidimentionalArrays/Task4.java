public class Task4 {

    public static void main(String[] args) {


        // 4 - display the row with min sum
        int[][] matrix = {//       i -> from 0 to matrix.length
                {1,3,1,5},//matrix[0].length // j -> from 0 to matrix[i].length
                {9,9,9,9},//matrix[1].length
                {3,5,5,1},//matrix[2].length
                {4,8,5,7},//matrix[3].length
        };
        int min = 0;
        int minRowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if(min > sum || i == 0){
                min = sum;
                minRowIndex = i;
            }
        }
        System.out.println(minRowIndex);


        for (int i = 0; i < matrix[minRowIndex].length; i++) {
            System.out.print(matrix[minRowIndex][i] + " ");
        }
    }
}
