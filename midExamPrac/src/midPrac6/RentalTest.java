package midPrac6;

public class RentalTest {

	public static void main(String[] args) {
		
		Rental r1 = new Rental("A300", 80);
		Rental r2 = new Rental("B410", 200);
		
		Rental r3 = new Rental();
		r3.setContractNum("A900");
		r3.setHoursandMins(145);
		
		System.out.println("RENTAL TEST RESULTS: \n");
        
        System.out.println("Rental 1:");
        r1.displayResults();
        System.out.println();

        System.out.println("Rental 2:");
        r2.displayResults();
        System.out.println();

        System.out.println("Rental 3:");
        r3.displayResults();
        System.out.println();
		
	}

}
