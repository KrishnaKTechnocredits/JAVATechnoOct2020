package nagendra;

public class Student {
	String studentName;
	int marks;
	String Grade;

	void studentName(String studentName) {
		this.studentName = studentName;
	}

	void gainedMark(int marks) {
		if (marks > 90) {
			Grade = "A+";
			System.out.println(studentName + " has got grade " + Grade);
		} else if (marks >= 80 && marks <= 90) {
			Grade = "A";
			System.out.println(studentName + " has got grade " + Grade);
		} else if (marks >= 70 && marks <= 80) {
			Grade = "B+";
			System.out.println(studentName + " has got grade " + Grade);
		} else if (marks >= 60 && marks <= 70) {
			Grade = "B";
			System.out.println(studentName + " has got grade " + Grade);
		} else {
			Grade = "C";
			System.out.println(studentName + " has got grade " + Grade);

		}

	}

	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Nagendra");
		student.gainedMark(95);
	}

}
