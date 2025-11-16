package MidPrac7;


public class MainBestseller {

	public static void main(String[] args) {
		Book c1 = new Book("13 Reasons Why", 120);
		Book c2 = new Book("Geronimo Stilton", 150);
        Book c3 = new Book("A Bend in A Road", 100);
        Book c4 = new Book("The Alchemist", 80);
        Book c5 = new Book("Pride and Prejudice", 50);
		
		System.out.print("RESULTS:");
		System.out.println();
		
		Bestseller b = new Bestseller(c1, c2, c3, c4, c5);
		b.displayResults();

	}

}
