package midPrac6;

public class Rental {
	
	public static final double minutesInAnHour = 60;
	public static final double hourlyRentalRate = 40;
	
	private String contractNum;
	private double numOfHours;
	private double numOfMins;
	private double price;
	
	// default constructor
	public Rental() {
		this.contractNum = "A000";
		setHoursandMins(0);
	}
	
	// non default constructor
	public Rental (String contractNum, double numOfMins) {
		setContractNum(contractNum);
		setHoursandMins(numOfMins);
	}
	
	public String getContractNum() {
		return contractNum;
	}
	
	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}
	
	public double getNumOfMins() {
		return numOfMins;
	}
	
	public double getNumOfHours() {
		return numOfHours;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setHoursandMins(double newNumOfMins) {
		numOfHours = (int)(newNumOfMins / minutesInAnHour);
		numOfMins = newNumOfMins % minutesInAnHour;
		price = (numOfHours * hourlyRentalRate) + (numOfMins / minutesInAnHour) * hourlyRentalRate;
		
	}
	
	public void displayResults() {
		System.out.printf("Contract Number: %s%n", contractNum);
		System.out.printf("Total Hours: %.2f%n", numOfHours);
		System.out.printf("Extra Minutes: %.2f%n", numOfMins);
		System.out.printf("Price: %.2f%n", price);
	}
	
}
