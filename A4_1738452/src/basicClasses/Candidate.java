package basicClasses;

import java.util.Random;

public class Candidate extends Person implements ServiceCertification{

	private CertificationExam certificationExam;
	private String examDate;
	private float examMark;
	private String grade; // A+, A, B+, B, C+, C, D+, D
	private int nbDaysToWait;
	
	
	// Constructor
	public Candidate(String fn, String ln, String p, CertificationExam ce, String eDate, String g) {
		super(fn, ln, p);
		this.certificationExam = ce;
		this.examDate = eDate;
		this.grade = g;
		
		Random r = new Random(); 
		int n = r.nextInt(2);
		DoCertificationExam doCertificationExam = new DoCertificationExam(this, this);
	}

	
	// Getters & Setters
	public CertificationExam getCertificationExam() {
		return certificationExam;
	}

	public void setCertificationExam(CertificationExam certificationExam) {
		this.certificationExam = certificationExam;
	}
	
	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String ed) {
		this.examDate = ed;		
	}

	public float getExamMark() {
		return examMark;
	}

	public void setExamMark(float em) {
		if (em < 0 || em > 100) {
			System.out.println("Number you entered is invalid.");
		}
		else {
			this.examMark = em;
		}
	}

	public String getGrade() {
		return grade;
	}

	public int getNbDaysToWait() {
		return nbDaysToWait;
	}

	
	
	// Unimplemented Methods From Interface
	@Override
	public void serviceSucess(String g) {
		
		String strTemp = g.toUpperCase(); // convert value to upper case
		char examDateFirstChar = strTemp.charAt(0); // revert to type char for shorter code
		char examDateSecondChar = g.charAt(1);
		
		// If string is 1 char ...
		if (examDateFirstChar < 65 || examDateFirstChar > 69 /* ASCII values of letters */) {
			System.out.println("You did not enter a valid grade.");
		}
		else {
			// If string is longer than 1 char ...
			if(g.length() > 1) {
				// Validate second char ...
				if(examDateSecondChar != '+') {
					System.out.println(examDateSecondChar + " is invalid for a grade.");
				}
				else {
					this.grade = g;
				}
			}
		}
	}

	@Override
	public void serviceFailure(int numOfDays) {
		this.nbDaysToWait = numOfDays;
	}

	// Overridden methods from class Object
	@Override
	public String toString() {
		// Verifies if candidate passed or not and outputs appropriate message.
		
		if (this.grade == "E") {
			System.out.println("\nFailed." + "\nCertification Exam ID: ");
		}
		else {
			System.out.println("Passed.");
		}
		
		return super.toString();
	}
	
	
	
}
