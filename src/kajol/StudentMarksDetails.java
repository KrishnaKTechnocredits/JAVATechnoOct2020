package kajol;

public class StudentMarksDetails {
	String studentName;
	int marksGained;
	String GradeObtained;
	
	void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	void marksGainedByStudent(int marksGained) {
		this.marksGained=marksGained;
	}
	
	void displayStudentResult() {
		if(marksGained>90)
			System.out.println(studentName+" scored "+marksGained+" percent marks with grade A+.");
		if(marksGained<=90 && marksGained>80)
			System.out.println(studentName+" scored "+marksGained+" percent marks with grade A.");
		if(marksGained<=80 && marksGained>70)
			System.out.println(studentName+" scored "+marksGained+" percent marks with grade B+.");
		if(marksGained<=70 && marksGained>=60)
			System.out.println(studentName+" scored "+marksGained+" percent marks with grade B.");
		if(marksGained<60)
			System.out.println(studentName+" scored "+marksGained+" percent marks with grade C.");
	}
	
	public static void main(String[] args) {
		StudentMarksDetails studentMarksDetails= new StudentMarksDetails();
		studentMarksDetails.setStudentName("Kajol");
		studentMarksDetails.marksGainedByStudent(90);
		studentMarksDetails.displayStudentResult();
		studentMarksDetails.setStudentName("Radha");
		studentMarksDetails.marksGainedByStudent(75);
		studentMarksDetails.displayStudentResult();
	}
}
	
