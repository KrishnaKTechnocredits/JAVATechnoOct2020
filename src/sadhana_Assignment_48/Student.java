package sadhana_Assignment_48;

public class Student implements Comparable<Student> {

	int studentId;
	String studentName;
	int studentStd;

	public Student(int studentId, String studentName, int studentStd) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentStd = studentStd;
	}

	@Override
	public int compareTo(Student details) {

		return this.studentName.compareTo(details.studentName);
	}

	@Override
	public String toString() {
		return this.studentName + "-" + this.studentStd;
	}
}
