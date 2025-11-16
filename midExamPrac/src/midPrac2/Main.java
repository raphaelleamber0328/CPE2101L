package midPrac2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = s.nextLine();
		
		System.out.print("Enter your GPA: ");
		double grade = s.nextDouble();
		
		BookstoreCredit b = new BookstoreCredit(name,grade);
		
		System.out.println();
        b.displayValues();
		
		s.close();
		
	}

}
