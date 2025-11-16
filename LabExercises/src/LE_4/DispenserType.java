package LE_4;

public class DispenserType {
	
	// CLASS: DispenserType
	class DispenserType {
	    private int numberOfItems;
	    private int cost; 

	    // Default constructor
	    public DispenserType() {
	        this.numberOfItems = 50;
	        this.cost = 50; 
	    }

	    // Constructor with parameters
	    public DispenserType(int setNoOfItems, int setCost) {
	        this.numberOfItems = setNoOfItems;
	        this.cost = setCost;
	    }

	    public int getNoOfItems() {
	        return numberOfItems;
	    }

	    public int getCost() {
	        return cost;
	    }

	    public int makeSale() {
	        if (numberOfItems > 0) {
	            numberOfItems--;
	        }
	        return numberOfItems;
	    }
	}
}
