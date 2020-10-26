package vishakha;

public class Student {
	
	String studentName;
	double gainedMarks;
	String grade;
	
	void studentName(String studentName){
		this.studentName = studentName;
	}
	
	void gainMarks(double gainedMarks){
		this.gainedMarks = gainedMarks;
	}
	
	void decideGrade(){
		if(gainedMarks > 90)
			grade = "A+";
		if(gainedMarks > 80 && gainedMarks <=90)
			grade = "A";
		if(gainedMarks > 70 && gainedMarks <=80)
			grade = "B+";
		if(gainedMarks > 60 && gainedMarks <=70)
			grade = "B";
		if(gainedMarks <= 60)
			grade = "C";
	}
	
	void displayResult(){
		System.out.println(studentName+ " has scored grade "+grade);
	}
	
	public static void main(String[] a){
		Student student = new Student();
		student.studentName("Vishakha");
		student.gainMarks(89);
		student.decideGrade();
		student.displayResult();
	}
}
