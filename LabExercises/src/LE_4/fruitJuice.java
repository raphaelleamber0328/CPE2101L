package LE_4;
import java.util.Scanner;

// CLASS: CashRegister
class CashRegister {
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

// MAIN PROGRAM
public class fruitJuice {

    private static void showSelection() {
    	System.out.println();
        System.out.println("WELCOME TO MY FRUIT JUICE MACHINE!");
        System.out.println("Please select a product by typing its number:");
        System.out.println("1: Apple Juice");
        System.out.println("2: Orange Juice");
        System.out.println("3: Mango Lassi");
        System.out.println("4: Fruit Punch");
        System.out.println("5: Cash register balance");
        System.out.println("0: Exit");
    }


    private static String formatCents(int cents) {
        return String.format("$%d.%02d", cents / 100, cents % 100);
    }

    private static void sellProduct(String productName, DispenserType dispenser, CashRegister register, Scanner scanner) {
        if (dispenser.getNoOfItems() <= 0) {
            System.out.println("Sorry, " + productName + " is sold out.");
            return;
        }

        int cost = dispenser.getCost();
        System.out.println();
        System.out.println(productName + " costs " + formatCents(cost) + ".");

        int deposited = 0;

        while (deposited < cost) {
            System.out.print("Payment: ");
            String input = scanner.nextLine().trim();

            double amountDouble;
            try {
                amountDouble = Double.parseDouble(input);
                if (amountDouble <= 0) {
                    System.out.println("Please deposit a positive amount.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            
            int amount = (int) Math.round(amountDouble * 100);

            deposited += amount;

            if (deposited < cost) {
                int remaining = cost - deposited;
                System.out.println("You still need " + formatCents(remaining) + ". Please deposit more.");
            }
        }

        
        register.acceptAmount(cost);
        int change = deposited - cost;
        dispenser.makeSale();

        System.out.println("Dispensing " + productName + ". Enjoy!");
        
        if (change > 0) {
            System.out.println("Returning change: " + formatCents(change));
        }
    }


    // MAIN METHOD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        CashRegister register = new CashRegister();
        
        DispenserType apple = new DispenserType(10, 150);     
        DispenserType orange = new DispenserType(10, 200);  
        DispenserType mango = new DispenserType(8, 250);      
        DispenserType punch = new DispenserType(5, 300);     

        boolean done = false;

        while (!done) {
            showSelection();
            System.out.println();
            System.out.print("Enter selection: ");
            String selection = scanner.nextLine().trim();

            switch (selection) {
                case "1":
                    sellProduct("Apple Juice", apple, register, scanner);
                    break;
                case "2":
                    sellProduct("Orange Juice", orange, register, scanner);
                    break;
                case "3":
                    sellProduct("Mango Lassi", mango, register, scanner);
                    break;
                case "4":
                    sellProduct("Fruit Punch", punch, register, scanner);
                    break;
                case "5":
                    System.out.println("Cash register balance: " + formatCents(register.getCurrentBalance()));
                    break;
                case "0":
                    System.out.println("Thank you for your purchase! Have a great day!");
                    done = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

        scanner.close();
    }
}