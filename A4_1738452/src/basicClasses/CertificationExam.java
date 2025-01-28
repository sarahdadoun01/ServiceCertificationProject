package basicClasses;

public class CertificationExam {
	private String id;
	private String title;
	private float successMark;
	private int numOfWaitDays;
	
	// Constructor
	public CertificationExam(String id, String t, float sm, int nowd) {
		this.id = id;
		this.title = t;
		this.successMark = sm;
		this.numOfWaitDays = nowd;
	}

	
	// Getters & setters
	public float getSuccessMark() {
		return successMark;
	}

	public void setSuccessMark(float sm) {
		this.successMark = sm;
	}

	public int getNumOfWaitDays() {
		return numOfWaitDays;
	}

	public void setNumOfWaitDays(int nowd) {
		this.numOfWaitDays = nowd;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	
	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + "\tTitle: " + title + "\tSuccess Mark: " + successMark + "\tNumber of Wait Days: " + numOfWaitDays;
	}
	
	
	
}
