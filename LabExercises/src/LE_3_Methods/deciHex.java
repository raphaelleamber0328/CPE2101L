package LE_3_Methods;

import java.util.Scanner;

public class deciHex {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int decNum = inputDecimal(keyboard);      
        String hexNum = convertHex(decNum);     
        printOutput(decNum, hexNum);           

        keyboard.close();
    }

    public static int inputDecimal(Scanner keyboard) {
        System.out.print("Enter a decimal number: ");
        return keyboard.nextInt();
    }

    public static String convertHex(int num) {
        if (num == 0) {
            return "0"; 
        }

        String hexa = "";

        while (num > 0) {
            int remainder = num % 16;
            String hexDigit;

            switch (remainder) {
                case 10: 
                	hexDigit = "A"; 
                	break;
                case 11: 
                	hexDigit = "B"; 
                	break;
                case 12:
                	hexDigit = "C"; 
                	break;
                case 13: 
                	hexDigit = "D"; 
                	break;
                case 14: 
                	hexDigit = "E"; 
                	break;
                case 15: 
                	hexDigit = "F"; 
                	break;
                default: 
                	hexDigit = remainder + ""; 
                	break;
            }

            hexa = hexDigit + hexa;
            num /= 16;
        }

        return hexa;
    }

    public static void printOutput(int decNum, String hexNum) {
        System.out.println("Hexadecimal: " + hexNum);
    }
}
