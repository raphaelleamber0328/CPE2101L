package LE_2;

import java.util.Scanner;

public class decTohex {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decNum = keyboard.nextInt();
       
        int num = decNum;
        String hexa = ""; 
        
        while (num > 0) {
            int remainder = num % 16;

        String hexNum;
        switch (remainder) {
                case 10: 
                	hexNum = "A"; 
                	break;
                case 11: 
                	hexNum = "B"; 
                	break;
                case 12: 
                	hexNum = "C"; 
                	break;
                case 13: 
                	hexNum = "D"; 
                	break;
                case 14: 
                	hexNum = "E"; 
                	break;
                case 15: 
                	hexNum = "F"; 
                	break;
                default: 
                	hexNum = remainder + ""; 
                	break;
            }
            
            hexa = hexNum + hexa; 
            num = num / 16;
        }
        
        System.out.println("Hexadecimal number: " + hexa);
        keyboard.close();
    }
}
