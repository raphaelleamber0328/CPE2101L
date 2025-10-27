package LE_1;

import java.util.Scanner;

public class changeDenomination {
	
    public static void main(String[] args) {
    	
        int amount;
        int originalAmount;
        int quarters;
        int dimes;
        int nickel;
        int pennies;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter amount (from 1 to 99 cents): ");
        if (keyboard.hasNextInt()) {
            amount = keyboard.nextInt();

            
            if (amount >= 1 && amount <= 99) {
                originalAmount = amount;
                quarters = amount / 25;
                amount = amount % 25;
                dimes = amount / 10;
                amount = amount % 10;
                nickel = amount / 5;
                amount = amount % 5;
                pennies = amount;

                System.out.println(originalAmount + " cents in coins can be given as:");
                System.out.println(quarters + " quarters");
                System.out.println(dimes + " dimes");
                System.out.println(nickel + " nickel");

                if (pennies == 1) 
                    System.out.println(pennies + " penny");
                else 
                    System.out.println(pennies + " pennies");
            } 
            else {
                System.out.println("Error!!! Amount must be between 1 and 99!!!");
            }
        } 
        else {
            System.out.println("Error: Invalid input. Please input an integer.");
        }

        keyboard.close();
    }
}
