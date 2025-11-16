package LE_4;

//CLASS: CashRegister
public class CashRegister {
	
	    private int cashOnHand;

	    // Default constructor
	    public CashRegister() {
	        this.cashOnHand = 500; 
	    }

	    // Constructor with parameter
	    public CashRegister(int cashIn) {
	        if (cashIn > 0) {
	            this.cashOnHand = cashIn;
	        } else {
	            this.cashOnHand = 500;
	        }
	    }

	    public int getCurrentBalance() {
	        return cashOnHand;
	    }

	    public int acceptAmount(int amountIn) {
	        if (amountIn > 0) {
	            cashOnHand += amountIn;
	        }
	        return cashOnHand;
	    }
	}

