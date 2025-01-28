package basicClasses;

public interface ServiceCertification {
	
	public static final CertificationExam EXAM_1Z0151 = new CertificationExam("1z0-151", "Python", 60, 30);
	public static final CertificationExam EXAM_1Z0147 = new CertificationExam("1z0-147", "Java", 66, 35);
	CertificationExam[] ceArray = {EXAM_1Z0151, EXAM_1Z0147};
	
	public void serviceSucess(String g); // A+, A, B+, B, C+, C, D+, D
	public void serviceFailure(int numOfDays);
}
