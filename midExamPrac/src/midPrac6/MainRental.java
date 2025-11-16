package midPrac6;

import java.util.Scanner;

public class MainRental {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Contract Number: ");
		String contractNum = s.nextLine();
		
		System.out.print("Enter number of minutes rented: ");
		double numOfMins = s.nextDouble();
		
		Rental r = new Rental(contractNum, numOfMins);
		
		System.out.println();
		System.out.println("DETAILS: ");
		r.displayResults();
		
		s.close();
	}

}
