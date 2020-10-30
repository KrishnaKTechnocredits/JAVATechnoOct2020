package vaibhav;

public class Student {
	
	String studentName;
	int  gainedMark;
	String grade;
	
	void studentName(String studentName) {
		this.studentName=studentName;
		
	}
	
	void gainedMark(int gainedMark) {
		this.gainedMark=gainedMark;
	}	
	
	void decideGrade() {
		if(gainedMark > 90)
			grade = "A+";
		else if(gainedMark > 80 && gainedMark < 90)
			grade = "A";
		else if(gainedMark > 70  && gainedMark < 80)
			grade = "B+";
		else if(gainedMark > 60  && gainedMark < 70)
			grade = "B";
		else if(gainedMark < 60)
			grade = "C";
	}
	
	void displayStudentInfo() {		
		System.out.println("Student name is "+studentName+" with Grade "+grade);
		
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentName("Vishakha");
		student.gainedMark(50);
		student.decideGrade();
		student.displayStudentInfo();		

	}

}
