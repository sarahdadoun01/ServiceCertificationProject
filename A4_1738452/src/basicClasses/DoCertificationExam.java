package basicClasses;

public class DoCertificationExam {
	private Candidate candidate;
	private ServiceCertification serviceCertification;
	//private CertificationExam certificationExam;
	
	public DoCertificationExam(Candidate c, ServiceCertification sc) {
		this.candidate = c;
		
		this.serviceCertification = sc; 	// This doesn't make sense ...
		//this.certificationExam = ce; 		// This makes more sense ...
		validateCertification();
	}

	// Getters & Setters
	public Candidate getCandidate() {
		return candidate;
	}

	public CertificationExam getCertificationExam() {
		return certificationExam;
	}
	
	public void setNumOfDaysWait(CertificationExam ce) {
		ce.setNumOfWaitDays(ce.getNumOfWaitDays());
	}
	
	// Methods
	public String getGrade(float examMark) {
		String grade = "";
		
		if (examMark >= 95) {
			grade = "A+";
		}
		if (examMark >= 90 && examMark < 95) {
			grade = "A";
		}
		if (examMark >= 85 && examMark <= 90) {
			grade = "B+";
		}
		if (examMark >= 80 && examMark <= 85) {
			grade = "B";
		}
		if (examMark >= 75 && examMark <= 80) {
			grade = "C+";
		}
		if (examMark >= 70 && examMark <= 75) {
			grade = "C";
		}
		if (examMark >= 65 && examMark <= 70) {
			grade = "D+";
		}
		if (examMark >= 60 && examMark <= 65) {
			grade = "D";
		}
		if (examMark < 60) {
			grade = "E";
		}
		
		return grade;
	}
	
	public void getMark(String ln, String examId) {
		// retrieves file called 'marks.txt' and takes mark from file with last name and and exam id.
	}
	
	public void validateCertification() {
		if (candidate.getExamMark() >= candidate.getCertificationExam().getSuccessMark()) {
			candidate.serviceSucess( getGrade(candidate.getExamMark()));
		}
		else {
			candidate.serviceFailure(candidate.getCertificationExam().getNumOfWaitDays());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(examMark >=95) → A+\n"
				+ "(examMark >=90 && examMark<95) → A\n"
				+ "(examMark >=85 && examMark<=90) → B+\n"
				+ "(examMark >=80 && examMark<=85) → B\n"
				+ "(examMark >=75 && examMark<=80) → C+\n"
				+ "(examMark >=70 && examMark<=75) → C\n"
				+ "(examMark >=65 && examMark<=70) → D+\n"
				+ "(examMark >=60 && examMark<=65) → D\n"
				+ "(examMark <60) → E";
	}
	
	
	
}
