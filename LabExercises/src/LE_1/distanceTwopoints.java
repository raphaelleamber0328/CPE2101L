package LE_1;

import java.util.Scanner;

public class distanceTwopoints {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double x1, y1, x2, y2;

        System.out.print("Enter x1: ");
        if (keyboard.hasNextDouble()) 
        {
            x1 = keyboard.nextDouble();
        } 
        else 
        {
            System.out.println("ERROR! Invalid Input.");
            keyboard.close();
            return;
        }

  
        System.out.print("Enter y1: ");
        if (keyboard.hasNextDouble()) {
            y1 = keyboard.nextDouble();
        } 
        else {
            System.out.println("ERROR! Invalid Input.");
            keyboard.close();
            return;
        }

        System.out.print("Enter x2: ");
        if (keyboard.hasNextDouble()) {
            x2 = keyboard.nextDouble();
        } else {
            System.out.println("ERROR! Invalid Input.");
            keyboard.close();
            return;
        }

        System.out.print("Enter y2: ");
        if (keyboard.hasNextDouble()) {
            y2 = keyboard.nextDouble();
        } else {
            System.out.println("ERROR! Invalid Input.");
            keyboard.close();
            return;
        }

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("\nThe distance between the two points is: " + distance);

        keyboard.close();
    }
}
