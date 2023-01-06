package Lesson05Arrays;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Please, enter elements for Array1, divided by space  and press ENTER:");
        String[] array1 = sc.nextLine().split(" ");
        System.out.println("Please, enter new elements for Array2, divided by space and press ENTER:");
        String[] array2 = sc.nextLine().split(" ");

        System.out.println();
        if (array1.length != array2.length) {
            System.out.println("Array1 and Array2 have different lengths.");
            System.out.println("Array1 and Array2 are different.");
            return;
        }
        else {
            System.out.println("Array1 and Array 2 have the same length.");
        }
        boolean areTheSame = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(array2[i])) {
                areTheSame = false;
                break;
            }
        }
        if (areTheSame) {
            System.out.println("Array1 and Array2 are the same.");
        }
        else {
            System.out.println("Array1 and Array2 are different.");
        }
    }
}
