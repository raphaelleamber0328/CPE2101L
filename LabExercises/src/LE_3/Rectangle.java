package LE_3;

public class Rectangle {
	
	private double width;
	private double height;
	
	// no arg constructor
	public Rectangle() {
		this.width = 1.0;
		this.height = 1.0;
	}
	
	// constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);	
	}
	
	public static void main(String[] args) {
		
		Rectangle defRectangle = new Rectangle();
		System.out.println("Width: " + defRectangle.getWidth());
		System.out.println("Height: " + defRectangle.getHeight());
        System.out.println("Area: " + defRectangle.getArea());
        System.out.println("Perimeter: " + defRectangle.getPerimeter());
		
	}
	
}
