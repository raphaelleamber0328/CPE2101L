package LE_3_Methods;

import java.util.Scanner;

public class dayWeek {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int year = inputYear(keyboard);
        int month = inputMonth(keyboard);
        int day = inputDay(keyboard);

        String dayOfWeek = calculateDayOfWeek(year, month, day);

        printOutput(dayOfWeek);

        keyboard.close();
    }

    public static int inputYear(Scanner keyboard) {
        System.out.print("Enter year (e.g., 2016): ");
        return keyboard.nextInt();
    }

    public static int inputMonth(Scanner keyboard) {
        System.out.print("Enter month (1 - 12): ");
        return keyboard.nextInt();
    }

    public static int inputDay(Scanner keyboard) {
        System.out.print("Enter the day of the month (1 - 31): ");
        return keyboard.nextInt();
    }

    
    public static String calculateDayOfWeek(int year, int month, int dayOfMonth) {
    	if (month == 1) 
        {
        	month = 13;
        	year = year - 1;
        } 
        
        if (month == 2) 
        {
        	month = 14;
        	year = year - 1;	
        }
        
        int j = year / 100;
        int k = year % 100; 

        int h = (dayOfMonth + (26 * (month + 1)) / 10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        switch (h) {
            case 0: return "Saturday";
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            default: return "Error"; 
        }
    }
    
    public static void printOutput(String dayOfWeek) {
        System.out.println("\nDay of the week is " + dayOfWeek + "!");
    }
}
