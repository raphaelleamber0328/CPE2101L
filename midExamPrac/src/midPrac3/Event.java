package midPrac3;

public class Event {
	
	public final static int pricePerGuest = 35;
	public final static int cutOff = 50;
	private String eventNumber;
	private int numOfGuests;
	private int price;
	
	//default constructor 
	public Event() {
		this.eventNumber = "A000";
		this.numOfGuests = 0; 
	}
	
	// constructor w parameter
	// constructor w parameter
	public Event(String eventNumber, int numOfGuests) {
	    setEventNumber(eventNumber);
	    setNumOfGuests(numOfGuests);
	}

	
	// set and get methods
	public String getEventNumber() {
		return eventNumber;
	}

	public void setEventNumber(String newEventNumber) {
		this.eventNumber = newEventNumber;
	}

	public int getNumOfGuests() {
		return numOfGuests;
	}

	public void setNumOfGuests(int newNumOfGuests) {
		if (newNumOfGuests <= 50) {
			this.numOfGuests = newNumOfGuests;
			calculateEventPrice();
		}
		else {
			System.out.print("ERROR! Only up to 50 guests!");
			System.out.println();
		}
		
		
	}
	
	// calculate
	public void calculateEventPrice() {	
		price = numOfGuests * pricePerGuest;
	}
	
	public int getPrice() {
		return price;
	}
	
	//display values
	public void displayEventDetails() {
		System.out.printf("Event Number: %s%n", eventNumber);
		System.out.printf("Number of Guests: %d%n", numOfGuests);
		System.out.printf("EVENT PRICE: %d%n", price);
	} 
	
}


