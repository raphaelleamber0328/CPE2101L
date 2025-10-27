package LE_3_Methods;

import java.util.Scanner;

public class chaDenom {

	static int originalAmount;
	static int quarters;
	static int dimes;
	static int nickel;
	static int pennies;
	
	public static void main(String[] args) {
		
		int amount = 0;
        try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("Enter amount (from 1 to 99 cents): ");
			
			if (keyboard.hasNextInt()) 
			{
			    amount = keyboard.nextInt();      
			}
			
			else 
			{
			    System.out.println("Error!!! Amount must be between 1 and 99!!!");
			}
		}
		calculate(amount);
        printResult();
		
	}
        
	public static void calculate(int amount) {
			
		originalAmount = amount;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickel = amount / 5;
		amount = amount % 5;
		pennies = amount;
		   
	}
	
	public static void printResult() {
	
		System.out.println(originalAmount + " cents in coins can be given as:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickel + " nickel");
	
	     if (pennies == 1) 
	     {
	         System.out.println(pennies + " penny");
	     }
	     else 
	     {
	         System.out.println(pennies + " pennies");
	     } 
	     
	}
}



         
