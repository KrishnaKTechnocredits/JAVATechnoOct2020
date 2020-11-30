package ankit;

public class Student {
	String studentName;
	int marksSecured;
	String grade;
	
	void studentName(String studentName) {
		this.studentName=studentName;
	}
	
	void gainedMarks(int marksSecured) {
		this.marksSecured=marksSecured;
	}
	
	void studentPerformance() {
		if(marksSecured>=90)
			grade="A+";
		else if(marksSecured>=80 && marksSecured<90)
			grade="A";
		else if(marksSecured>=70 && marksSecured<80)
			grade="B+";
		else if(marksSecured>=60 && marksSecured<70)
			grade="B";	
		else if(marksSecured<60)
			grade = "C";
	}
	
	void displayStudentReport() {
		System.out.println(studentName+" has secured grade "+grade+ " in the exam");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Harsh");
		student.gainedMarks(80);
		student.studentPerformance();
		student.displayStudentReport();

	}

}
