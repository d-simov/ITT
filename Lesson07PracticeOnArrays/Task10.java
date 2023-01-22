package Lesson07PracticeOnArrays;

public class Task10 {

    public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 1, 1, 2, 1, 9, 1};

        int mostRepeatedNumber = array[0];
        int maxRepetitions = 0;
        for (int i = 0; i < array.length; i++) {
            int repetitions = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repetitions++;
                }
            }
            if (maxRepetitions < repetitions) {
                maxRepetitions = repetitions;
                mostRepeatedNumber = array[i];
            }
        }
        System.out.println("Most repeated number is " + mostRepeatedNumber + ". (" + maxRepetitions + ") repetitions.");
    }

}
