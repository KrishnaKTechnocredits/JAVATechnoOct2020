package sadhana;
	
	

public class Student {
	String StudentName;
	int TotalMarks;
	String Grade;
	void studentName(String name) {
		StudentName=name;
	}
	void gainedMark(int Marks) {
		TotalMarks=Marks;
	}
	void studentMarkDetails() {
		if(TotalMarks>=90)
			Grade="A+";
		else if(TotalMarks>=80)
			Grade="A";
		else if(TotalMarks>=70)
			Grade="B+";
		else if(TotalMarks>=60)
			Grade="B";
		else
			Grade="C";
		System.out.println("Student name: "+StudentName +" and grade is: "+Grade);
	}


	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Sadhana");
		student.gainedMark(70);
		student.studentMarkDetails();
	}

}
