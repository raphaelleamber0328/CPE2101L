package LE_2;

import java.util.Scanner;

public class dayoftheWeek {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
        System.out.print("Enter year: (e.g., 2016): ");
        int year = keyboard.nextInt();
        
        System.out.print("Enter Month (1 - 12): ");
        int month = keyboard.nextInt();
        
        System.out.print("Enter the day of the month (1 - 31): ");
        int dayofMonth = keyboard.nextInt();
        
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
        
        int h = (dayofMonth + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        String dayOfWeek = " ";
        
        switch (h) {
	        case 0: 
	        	dayOfWeek = "SATURDAY!"; 
	        	break;
	        case 1: 
	        	dayOfWeek = "SUNDAY!"; 
	        	break;
	        case 2: 
	        	dayOfWeek = "MONDAY!"; 
	        	break;
	        case 3: 
	        	dayOfWeek = "TUESDAY!"; 
	        	break;
	        case 4: 
	        	dayOfWeek = "WEDNESDAY!"; 
	        	break;
	        case 5: 
	        	dayOfWeek = "THURSDAY!"; 
	        	break;
	        case 6: 
	        	dayOfWeek = "FRIDAY!"; 
	        	break;
    }
        
        System.out.println("\nDay of the week is " + dayOfWeek);
        keyboard.close();
	}
}
		

 