package LE_1;

import java.util.Scanner;

public class multiplyDigits {
	
    public static void main(String[] args) {
		
        int num;
        int result = 1;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        
        if (keyboard.hasNextInt()) {
            num = keyboard.nextInt();

            if (num >= 0 && num <= 1000) {
                int origNum = num;
                
                if (num == 0) {
                    result = 0;
                } else {
                    while (num > 0) {
                        result *= (num % 10); 
                        num /= 10;  
                    }
                }

                System.out.println("The product of all digits in " + origNum + " is " + result);
            } else {
                System.out.println("Number must be between 0 and 1000!!!");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        keyboard.close();
    }
}
