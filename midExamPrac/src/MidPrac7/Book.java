package MidPrac7;

public class Book {
    
    private String bookTitle;
    private int numOfSales;
    public static int totalSales = 0;
    
    public Book() {
        this.bookTitle = "";
        this.numOfSales = 0;
    }
    
    public Book(String bookTitle, int numOfSales) {
        this.bookTitle = bookTitle;
        this.numOfSales = numOfSales;
        Book.totalSales += numOfSales;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public int getNumOfSales() {
        return numOfSales;
    }
    
    public void setNumOfSales(int numOfSales) {
        Book.totalSales -= this.numOfSales;
        this.numOfSales = numOfSales;
        Book.totalSales += numOfSales;
    }
    
    public static int getTotalSales() {
        return totalSales;
    }
}
