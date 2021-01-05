package shrutiS.assignment48;

public class Student implements Comparable<Student> {

	int studentId;
	String studentName;
	int studentStd;
	
	public Student(int studentId,String studentName, int studentStd){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentStd = studentStd;		
	}

	@Override
	public int compareTo(Student std) {
		return this.studentName.compareTo(std.studentName);
	}
	
	@Override
	public String toString() {
		
		return this.studentName + "-->" + this.studentStd;
	}
}
