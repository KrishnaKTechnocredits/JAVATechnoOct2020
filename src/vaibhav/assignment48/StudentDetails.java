package vaibhav.assignment48;

public class StudentDetails implements Comparable<StudentDetails>{
	
	int studentId;
	String studentName;
	int studentStd;
	
	public StudentDetails	(int studentId,String studentName, int studentStd){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentStd = studentStd;		
	}

	@Override
	public int compareTo(StudentDetails std) {
		return this.studentName.compareTo(std.studentName);
	}
	
	@Override
	public String toString() {
		
		return this.studentName + "-->" + this.studentStd;
		
	}

}
