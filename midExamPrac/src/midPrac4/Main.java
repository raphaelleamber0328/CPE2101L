package midPrac4;


public class Main {

	public static void main(String[] args) {
		Candidate c1 = new Candidate("Jeonghan", 120);
		Candidate c2 = new Candidate("Heeseung", 150);
        Candidate c3 = new Candidate("Beomgyu", 100);
        Candidate c4 = new Candidate("Euijoo", 80);
        Candidate c5 = new Candidate("Keonho", 50);
		
		System.out.print("VOTING RESULTS");
		System.out.println();
		
		Election e = new Election(c1, c2, c3, c4, c5);
		e.displayResults();
	
	}

}
