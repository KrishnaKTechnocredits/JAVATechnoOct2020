package priyanka;

class Student {
	String studentName;
	int marks;
	String grade;

	void studentName(String studentName) {
		this.studentName = studentName;
	}

	void gainMarks(int marks) {
		this.marks = marks;
		if (marks > 90)
			grade = "A+";
		else if (marks <= 90 && marks >= 80)
			grade = "A";
		else if (marks <= 80 && marks >= 70)
			grade = "B+";
		else if (marks <= 70 && marks <= 60)
			grade = "B";
		else if (marks < 60)
			grade = "C";
	}

	void studentInfo() {
		System.out.println(studentName + "'s Grade is " + grade);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Riya");
		student.gainMarks(85);
		student.studentInfo();
	}

}
