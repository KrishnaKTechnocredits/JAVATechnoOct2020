package shrutiC;

class Student {

	String name, grade;

	void studentName(String name) {
		this.name = name;

	}

	void gainedMark(int marks) {

		if (marks > 90) {
			grade = "A+";
		} else if (marks > 80 && marks <= 90) {
			grade = "A";
		} else if (marks > 70 && marks <= 80) {
			grade = "B+";
		} else if (marks > 60 && marks <= 70) {
			grade = "B";
		} else if (marks <= 60) {
			grade = "C";
		}
	}

	void displayStudentInfo() {
		System.out.println(name + " has received grade : " + grade);

	}

	public static void main(String[] args) {

		Student student = new Student();
		student.studentName("Shruti");
		student.gainedMark(92);
		student.displayStudentInfo();
		
	}

}
