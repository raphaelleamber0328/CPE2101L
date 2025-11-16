package midPrac4;

public class Candidate {
	
	private String surname;
	public  int numOfVotes;
	public static int totalVotes = 0;
	
	// default  constructor
	public Candidate() {
		this.surname = "";
		this.numOfVotes = 0;
	}
	
	//constructor w parameter
	public Candidate(String surname, int numOfVotes) {
		this.surname = surname;
        this.numOfVotes = numOfVotes;
		Candidate.totalVotes += numOfVotes;
	}
	
	// get set methods
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String newSurname) {
		this.surname = newSurname;
	}

	public int getNumOfVotes() {
		return numOfVotes;
	}

	public void setNumOfVotes(int newNumOfVotes) {
		Candidate.totalVotes -= numOfVotes;
		this.numOfVotes = newNumOfVotes;
		Candidate.totalVotes += numOfVotes;
	}
	
	public static int getTotalVotes() {
		return totalVotes;
	}
	
}
