package LE_1;

import java.util.Scanner;

public class chocolateBars {
	
    public static void main(String[] args) {
		
        float weight = 0;
        float height = 0;
        int age = 0;
        double bmrWom;
        double bmrMen;
        double barsWom;
        double barsMen;
        int chocoBars = 230;

        Scanner keyboard = new Scanner(System.in);

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
            keyboard.close();
            return;
        }

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

        keyboard.close();

     
        bmrWom = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        bmrMen = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        barsWom = bmrWom / chocoBars;
        barsMen = bmrMen / chocoBars;

       
        System.out.printf("%nCalories needed for woman: %.2f%n", bmrWom);
        System.out.printf("Calories needed for man: %.2f%n", bmrMen);
        System.out.printf("Chocolate bars needed for woman: %.2f%n", barsWom);
        System.out.printf("Chocolate bars needed for man: %.2f%n", barsMen);
    }
}
