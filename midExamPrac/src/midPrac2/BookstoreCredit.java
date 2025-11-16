package midPrac2;

public class BookstoreCredit {
	
	private String name;
	private double grade;
	private double totalCredit;
	
	//default constructor
	public BookstoreCredit() {
		this.name = "";
		this.grade = 0;
		this.totalCredit = 0;
	}
	
	// constructor with parameter
	public BookstoreCredit(String newName, double newGrade) {
		this.name = newName;
		this.grade = newGrade;
		this.totalCredit = calculateValues();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public double getTotalCredit() {
		return totalCredit;
	}
	
	public void totalCredit(double newtotalCredit) {
		this.totalCredit = newtotalCredit;
	}
	
	 double calculateValues() {
        totalCredit = 75 * grade;
        return totalCredit;
	}
	
	public void displayValues() {
		System.out.printf("Name of Student: %s%n", name);
		System.out.printf("GPA: %.2f%n", grade);
		System.out.printf("TOTAL CREDIT: %.2f%n", totalCredit);
	}
}
