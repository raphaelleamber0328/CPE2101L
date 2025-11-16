package midPrac3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Event Number: ");
		String eventNumber = s.nextLine();
		
		System.out.print("Enter number of Guests: ");
		int numOfGuests = s.nextInt();
		
		Event e = new Event(eventNumber, numOfGuests);
		System.out.println();
		e.displayEventDetails();
		
		s.close();

	}

}
