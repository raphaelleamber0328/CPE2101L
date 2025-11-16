package midPrac4;

import java.util.Scanner;

public class ElectionTest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Instantiate candidate objects using non-default constructor
	        Candidate c1 = new Candidate("Johnson", 5000);
	        Candidate c2 = new Candidate("Miller", 4000);
	        Candidate c3 = new Candidate("Duffy", 6000);
	        Candidate c4 = new Candidate("Robinson", 2500);
	        Candidate c5 = new Candidate("Ashton", 1800);

	        // Create an election object and pass the candidates
	        Election e = new Election(c1, c2, c3, c4, c5);

	        // Display the election results
	        e.displayResults();
	        
	        scanner.close();
	    }
}
