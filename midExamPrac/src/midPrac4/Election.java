package midPrac4;

public class Election {
	
	private Candidate c1;
	private Candidate c2;
	private Candidate c3;
	private Candidate c4;
	private Candidate c5;
	
	//default constructor
	public Election() {
		c1 = new Candidate();
		c2 = new Candidate();
		c3 = new Candidate();
		c4 = new Candidate();
		c5 = new Candidate();
	}
	
	//non default constructor
	public Election(Candidate c1, Candidate c2, Candidate c3, Candidate c4, Candidate c5) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
	}
	
	//Calculate total votes
	public int calculateTotalVotes() {
		return Candidate.totalVotes;
	}
	
	// percentage of total votes
	public double percentOfTotalVotes(Candidate candidate) {
	    int totalVotes = calculateTotalVotes();
	    if (totalVotes == 0) return 0;
	    return ((double) candidate.getNumOfVotes() / totalVotes) * 100;
	}

	
	// determine winner
	public String determineWinner() {
		Candidate winner = c1;
		
		if (c2.getNumOfVotes() > winner.getNumOfVotes()) winner = c2;
		if (c3.getNumOfVotes() > winner.getNumOfVotes()) winner = c3;
		if (c4.getNumOfVotes() > winner.getNumOfVotes()) winner = c4;
		if (c5.getNumOfVotes() > winner.getNumOfVotes()) winner = c5;
		
		return winner.getSurname();
	}
	
	 // Display election results in tabulated format
	public void displayResults() {
	    System.out.printf("%-15s %-15s %-15s%n", "Candidate", "Votes Received", "% of Total Votes");
	    displayCandidateResult(c1);
	    displayCandidateResult(c2);
	    displayCandidateResult(c3);
	    displayCandidateResult(c4);
	    displayCandidateResult(c5);

	    System.out.printf("%-15s %-15d%n", "Total Votes", calculateTotalVotes());
	    System.out.printf("The Winner is %s.%n", determineWinner());
	}

    private void displayCandidateResult(Candidate candidate) {
        System.out.printf("%-15s %-15d %-15.2f%n",
            candidate.getSurname(),
            candidate.getNumOfVotes(),
            percentOfTotalVotes(candidate));
    }
	
	
	
	
	

}
