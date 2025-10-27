package LE_3;

import java.util.Scanner;

public class gradeDistribution {
	
	private int letterA;
	private int letterB;
	private int letterC;
	private int letterD;
	private int letterF;
	
	//constructor
	public gradeDistribution(int letterA, int letterB, int letterC, int letterD, int letterF) {
		this.letterA = letterA;
		this.letterB = letterB;
		this.letterC = letterC;
		this.letterD = letterD;
		this.letterF = letterF;
	}
	
	public int totalGrade() {
        return letterA + letterB + letterC + letterD + letterF;
    }
	
	private int calculatePercent(int letter) {
	    int total = totalGrade();
	    int percent = (letter * 100 + total / 2) / total;
	    return percent;
	}

	public int getLetterA() {
		return calculatePercent(letterA);
	}
	
	public int getLetterB() {
		return calculatePercent(letterB);
	}
	
	public int getLetterC() {
		return calculatePercent(letterC);
	}
	
	public int getLetterD() {
		return calculatePercent(letterD);
	}
	
	public int getLetterF() {
		return calculatePercent(letterF);
	}
	
	public void barGraph() {
		System.out.println();
        System.out.println("    0    10   20   30   40   50   60   70   80   90   100%");
        System.out.println("    |----|----|----|----|----|----|----|----|----|----|");
        System.out.println();
        
        displayAsterisk("A", getLetterA());
        displayAsterisk("B", getLetterB());
        displayAsterisk("C", getLetterC());
        displayAsterisk("D", getLetterD());
        displayAsterisk("F", getLetterF());
    }
	
	private void displayAsterisk(String grade, int percent) {
	    int asterisk = percent / 2; 
	    
	    System.out.printf("%-3s ", grade);
	    
	    for (int i = 0; i < asterisk; i++) 
	    {
	        System.out.print("*");
	    }
	    System.out.printf(" (%d%%)%n", percent);
	}
	
	
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of A grades: ");
        int letterA = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter number of B grades: ");
        int letterB = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Enter number of C grades: ");
        int letterC = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Enter number of D grades: ");
        int letterD = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Enter number of F grades: ");
        int letterF = keyboard.nextInt();
        
        gradeDistribution gd = new gradeDistribution(letterA, letterB, letterC, letterD, letterF);
        gd.barGraph();
        
        keyboard.close();
        
    }
}
