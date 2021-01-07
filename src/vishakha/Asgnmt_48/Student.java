package vishakha.Asgnmt_48;

public class Student implements Comparable<Student>{
	String studentName;
	int studentId;
	int studentStd;

	public Student(String studentName, int studentId, int studentStd) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentStd = studentStd;
	}
	
	@Override
	public int compareTo(Student object) {
		return this.studentName.compareTo(object.studentName);
	}
	
	@Override
	public String toString() {
		return "Student Name: "+this.studentName+", Student Id: "+studentId+", Student Std: "+studentStd;
	}
}