/*
 Assignment : 48
  Student class having attribute -> studentId, studentName, studentStd.
   A) Use comparable to sort all students based on studentName.
 */

package yogita;

public class Student_Data implements Comparable<Student_Data> {
	int studentId;
	String studentName, studentStd;

	Student_Data(int studentId, String studentName, String studentStd) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentStd = studentStd;

	}

	public int compareTo(Student_Data student) {
		return this.studentName.compareTo(student.studentName);
	}

	public String toString() {
		return "Student Name: " + studentName + " Student Id: " + studentId + " Student Std: " + studentStd + "\n";
	}

}
