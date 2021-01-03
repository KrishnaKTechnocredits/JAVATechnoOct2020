/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/
package suvela.assignment48;

public class StudentInfo implements Comparable<StudentInfo> {
	int stdId;
	String stdName;
	int stdStd;

	public StudentInfo(int stdId, String stdName, int stdStd) {
		this.stdId = stdId;
		this.stdName =stdName;
		this.stdStd = stdId;
	}

	@Override
	public int compareTo(StudentInfo o) {
		return this.stdName.compareTo(o.stdName);
	}
	public String toString(){
		return stdId + ":" + stdName + ":" + stdStd ;
	}
}

