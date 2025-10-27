package LE_3_Methods;

import java.util.Random;

public class flipCoin {

    public static void main(String[] args) {
    	
        int FLIPS = 2000000;
        Random rand = new Random();

        int heads = flipHeads(rand, FLIPS);
        int tails = FLIPS - heads;

        displayResults(FLIPS, heads, tails);
    }

    public static int flipHeads(Random rand, int flips) {
        int heads = 0;
        for (int i = 0; i < flips; i++) {
            if (rand.nextBoolean()) {
                heads++;
            }
        }
        return heads;
    }

 
    public static void displayResults(int flips, int heads, int tails) {
        System.out.printf("Total Flips: %,d%n", flips);
        System.out.printf("Heads: %,d%n", heads);
        System.out.printf("Tails: %,d%n", tails);
    }
}
