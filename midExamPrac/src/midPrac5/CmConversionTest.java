package midPrac5;

public class CmConversionTest {

	public static void main(String[] args) {
		
		CmConversion c1 = new CmConversion(25);
		CmConversion c2 = new CmConversion(36);
		
		CmConversion c3 = new CmConversion();
		c3.setCentimeters(12);
		c3.getCentimeters();
		
		
		c1.displayResults();
		System.out.println("centimeters = 25");
		
		c2.displayResults();
		System.out.println("centimeters = 36");
		
		c3.displayResults();
		System.out.println("centimeters = 12");
	
	}

}
