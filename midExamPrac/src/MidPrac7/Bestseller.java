package MidPrac7;

public class Bestseller {
	
	private Book b1;
	private Book b2;
	private Book b3;
	private Book b4;
	private Book b5;
	
	public Bestseller() {
		b1 = new Book();
		b2 = new Book();
		b3 = new Book();
		b4 = new Book();
		b5 = new Book();
	}
	
	public Bestseller(Book b1, Book b2, Book b3, Book b4, Book b5) {
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
		this.b5 = b5;
	}
	
	public int calculateTotalSales() {
		return b1.getNumOfSales() + b2.getNumOfSales() +
		       b3.getNumOfSales() + b4.getNumOfSales() +
		       b5.getNumOfSales();
	}
	
	public double percentOfTotalSales(Book book) {
	    int totalSales = calculateTotalSales();
	    if (totalSales == 0) return 0;
	    return (double) book.getNumOfSales() / totalSales * 100;
	}
		
	public String determineWinner() {
		Book winner = b1;
		if (b2.getNumOfSales() > winner.getNumOfSales()) winner = b2;
		if (b3.getNumOfSales() > winner.getNumOfSales()) winner = b3;
		if (b4.getNumOfSales() > winner.getNumOfSales()) winner = b4;
		if (b5.getNumOfSales() > winner.getNumOfSales()) winner = b5;
		return winner.getBookTitle();
	}
	
	public void displayResults() {
	    System.out.printf("%-25s %-25s %-25s%n", "Book Title", "Total Sales", "% of Total Sales");
	    displayBookResult(b1);
	    displayBookResult(b2);
	    displayBookResult(b3);
	    displayBookResult(b4);
	    displayBookResult(b5);

	    System.out.printf("%-25s %-25d%n", "Total Sales", calculateTotalSales());
	    System.out.printf("The Winner is %s.%n", determineWinner());
	}

    private void displayBookResult(Book book) {
        System.out.printf("%-25s %-25d %-25.2f%n",
            book.getBookTitle(),
            book.getNumOfSales(),
            percentOfTotalSales(book));
    }
}
