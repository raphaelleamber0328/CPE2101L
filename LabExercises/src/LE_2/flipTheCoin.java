package LE_2;

import java.util.Random;

public class flipTheCoin {
    public static void main(String[] args) {
        int FLIPS = 2000000;
        Random rand = new Random();

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < FLIPS; i++) 
        {
            if (rand.nextBoolean()) 
            { 
                heads++;
            } 
            else 
            {
                tails++;
            }
        }

        System.out.printf("Total Flips: %,d%n", FLIPS);
        System.out.printf("Heads: %,d%n", heads);
        System.out.printf("Tails: %,d%n", tails);
    }
}
