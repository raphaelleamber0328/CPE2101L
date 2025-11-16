package MidPrac7;

public class BestsellerTest {

    public static void main(String[] args) {
        
       
        Book b1 = new Book("Tuesdays with Morrie", 120);
        Book b2 = new Book("One More Day", 250);
        
     
        Book b3 = new Book();
        b3.setBookTitle("The Book Thief");
        b3.setNumOfSales(180);
        
        Book b4 = new Book();
        b4.setBookTitle("Jane Eyre");
        b4.setNumOfSales(300);
        
        
        Book b5 = new Book("A Little life", 150);
        
       
        Bestseller bestseller = new Bestseller(b1, b2, b3, b4, b5);
        bestseller.displayResults();
    }
}
