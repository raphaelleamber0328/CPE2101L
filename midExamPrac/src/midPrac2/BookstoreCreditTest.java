package midPrac2;

import java.util.Scanner;

public class BookstoreCreditTest {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Create book objects
		BookstoreCredit b1 = new BookstoreCredit("Jeon Wonwoo", 5.1);
		BookstoreCredit b2 = new BookstoreCredit("Lee Heeseung", 5.3);
		BookstoreCredit b3 = new BookstoreCredit("Choi Beomgyu", 3.9);
		BookstoreCredit b4 = new BookstoreCredit("Jeon Jungkook", 2.8);
		
		BookstoreCredit b5 = new BookstoreCredit();
		b5.setName("Margs");
		b5.setGrade(3.2);
		b5.calculateValues();
		System.out.println(b5.getName()+ " " + b5.getGrade() + " " + b5.getTotalCredit());
		b5.displayValues();
		
		b1.displayValues();
		b2.displayValues();
		b3.displayValues();
		b4.displayValues();
		
		s.close();
		
		
		
	}
	

	

}
