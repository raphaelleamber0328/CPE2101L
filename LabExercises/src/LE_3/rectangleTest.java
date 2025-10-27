package LE_3;

public class rectangleTest {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("RECTANGLE 1");
		System.out.println("Width: " + r1.getWidth());
		System.out.println("Height: " + r1.getHeight());
	    System.out.printf("Area: %.2f%n", r1.getArea());
	    System.out.printf("Perimeter: %.2f%n ", r1.getPerimeter());
	        
        System.out.println("\nRECTANGLE 2");
        System.out.println("Width: " + r2.getWidth());
		System.out.println("Height: " + r2.getHeight());
        System.out.printf("Area: %.2f%n", r2.getArea());
        System.out.printf("Perimeter: %.2f%n", r2.getPerimeter());
	    }
}

