/*Assignment : 48
Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/

package poojap;

public class Student_Comparable implements Comparable<Student_Comparable> {

	String studentName;
	int studentId;
	int studentStd;

	public Student_Comparable(String studentName, int studentId, int studentStd) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentStd = studentStd;
	}

	@Override
	public int compareTo(Student_Comparable object) {

		return this.studentName.compareTo(object.studentName);
	}

	@Override
	public String toString() {

		return "Student Name: " + studentName + " Student Id: " + studentId + " Student Std: " + studentStd + "\n";
	}
}
