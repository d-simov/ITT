import java.util.Random;

public class ConsecutiveDice {

    public static void main(String[] args) {
        /*
        Write a program that asks you to roll two dice and checks the sum of their values.The program asks you to
        throw the dice until you achieve seven consecutive sums of value '7'.
        After that the program must tell you how many total tries you have done to achieve this result.
         */
        Random rand = new Random();
        int totalTries = 0;
        int successfulTries = 0;
        do {
            int result = throwDice(rand);
            totalTries++;
            if (neededResult(result)) {
                successfulTries++;
            }
            else {
                successfulTries = 0;
            }
        } while (successfulTries < 7);

        System.out.println("Seven consecutive results of '7' achieved with " + totalTries + " total tries.");
    }

    private static int throwDice(Random rand) {
        int dice1Result = rand.nextInt(6) + 1;
        int dice2Result = rand.nextInt(6) + 1;
        System.out.println(dice1Result + " + " + dice2Result + " = " + (dice1Result + dice2Result));
        return dice1Result + dice2Result;
    }

    private static boolean neededResult(int number) {
        return number == 7;
    }
}
