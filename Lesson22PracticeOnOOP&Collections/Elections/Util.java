package main;

import java.util.Random;

public class Util {


    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max-min+1) + min;
    }

    public static boolean getRandomBoolean() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
