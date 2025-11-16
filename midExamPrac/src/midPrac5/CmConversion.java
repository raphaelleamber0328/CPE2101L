package midPrac5;

public class CmConversion {
	
	private double centimeters;
	
	// default constructor 
	public CmConversion() {
		this.centimeters = 0;
	}
	
	// constructor w parameters
	public CmConversion(double centimeters) {
		this.centimeters = centimeters;
	}
	
	// methods to set and get the values
	public double getCentimeters() {
		return centimeters;
	}

	public void setCentimeters(double centimeters) {
		this.centimeters = centimeters;
	}
	
	//conversion of centimeter to inch
	public double cmToInchConversion() {
		return centimeters / 2.54;
	}
	
	// conversion of centimeter to yard
	public double cmToYardConversion() {
		double inches = cmToInchConversion();
		double feet = inches / 12;
		return feet / 3;
	}
	
	public void displayResults() {
		System.out.println();
		System.out.println("RESULTS:");
		System.out.printf("cm to inch = %.2f%n", cmToInchConversion());
		System.out.printf("cm to yard = %.2f%n", cmToYardConversion());
	}
}


