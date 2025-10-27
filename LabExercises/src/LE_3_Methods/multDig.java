package LE_3_Methods;

import java.util.Scanner;

public class multDig {

	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);

	        int num = inputUser(keyboard);         
	        int product = calculateDigitProduct(num); 
	        displayResult(num, product);              

	        keyboard.close();
	    }

	   
	    public static int inputUser(Scanner keyboard) {
	        System.out.print("Enter a number between 0 and 1000: ");
	        return keyboard.nextInt(); 
	    }

	    public static int calculateDigitProduct(int num) {

	        int result = 1;
	        while (num > 0) {
	            result = result * (num % 10); 
	            num /= 10;            
	        }
	        return result;
	    }
	    
	    public static void displayResult(int original, int product) {
	        System.out.println("The product of all digits in " + original + " is " + product);
	    }
	}
