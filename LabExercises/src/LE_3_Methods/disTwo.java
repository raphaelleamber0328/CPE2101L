package LE_3_Methods;

import java.util.Scanner;

public class disTwo {
	
	static double x1, y1, x2, y2;
	static double distance;
	
	public static void main(String[] args) {
	
		input();
		calculateDistance();
		printOutput();
}

		public static void input() {
			try (Scanner keyboard = new Scanner(System.in)) {
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
			}
			
		}
		
		public static void calculateDistance() {
			
			 distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
		}
		
		public static void printOutput() {
			System.out.println("\nThe distance between the two points is: " + distance);
		}
		
		
		
}