package LE_3_Methods;

import java.util.Scanner;

public class chocBars {
	
	static float weight;
	static float height;
	static int age;
	static double bmrWom;
	static double bmrMen;
	static double barsWom;
	static double barsMen;
	static int chocoBars = 230;
    
    public static void main(String[] args) {
    	
    	inputUser();
    	calculate();
    	printOutput();
    }
    	
    public static void inputUser() {
    	
    	try (Scanner keyboard = new Scanner(System.in)) {
			// input weight
			System.out.print("Enter weight (lbs): ");
			if (keyboard.hasNextFloat()) 
			{
			    weight = keyboard.nextFloat();
			    if (weight <= 0) 
			    {
			        System.out.println("ERROR!");
			        keyboard.close();
			        return;
			    }
			} 
			else 
			{
			    System.out.println("Error: Invalid input. Please enter a numeric value for weight.");
			    return;
			}
			
			// input height
			System.out.print("Enter height (in): ");
			if (keyboard.hasNextFloat()) 
			{
			    height = keyboard.nextFloat();
			    if (height <= 0) 
			    {
			        System.out.println("ERROR!");
			        keyboard.close();
			        return;
			    }
			} 
			else 
			{
			    System.out.println("Invalid input! Please enter a numeric value for height!");
			    keyboard.close();
			    return;
			}
			
			// input age
			System.out.print("Enter age (years): ");
			if (keyboard.hasNextInt()) 
			{
			    age = keyboard.nextInt();
			    if (age <= 0) 
			    {
			        System.out.println("ERROR!");
			        keyboard.close();
			        return;
			    }
			}
			else 
			{
			    System.out.println("Invalid input! Please enter an integer value for age!");
			    keyboard.close();
			    return;
			}
		}
    }
    
    public static void calculate() {
    	
    	bmrWom = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        bmrMen = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        barsWom = bmrWom / chocoBars;
        barsMen = bmrMen / chocoBars;
       
    }
    	
    public static void printOutput() {
    	
    	 System.out.printf("%nCalories needed for woman: %.2f%n", bmrWom);
         System.out.printf("Calories needed for man: %.2f%n", bmrMen);
         System.out.printf("Chocolate bars needed for woman: %.2f%n", barsWom);
         System.out.printf("Chocolate bars needed for man: %.2f%n", barsMen);
    }
   
}

