package midPrac3;
import java.util.Scanner;

public class EventTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Create event objects
		Event e1 = new Event("A300", 20);
		Event e2 = new Event("A400", 40);
		
		Event e3 = new Event();
		e3.setEventNumber("A100");
		e3.setNumOfGuests(35);
		
		System.out.println("DETAILS:");
		System.out.println(e3.getEventNumber());
		System.out.println(e3.getNumOfGuests());
		System.out.println(e3.getPrice());
		
		System.out.println();
		e3.displayEventDetails();
		
		System.out.println();
		e1.displayEventDetails();
		e2.displayEventDetails();
		
		s.close();

	}

}
