package anjaliS;

import java.util.ArrayList;

public class StudentDetails implements Comparable<StudentDetails> {
	int studentId;
	String studentName, studentStd;

	StudentDetails(int studentId, String studentName, String studentStd) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentStd = studentStd;

	}

	public int compareTo(StudentDetails student) {
		return this.studentName.compareTo(student.studentName);
	}

	public String toString() {
		return "Student Name: " + studentName + " Student Id: " + studentId + " Student Std: " + studentStd + "\n";
	}

}
