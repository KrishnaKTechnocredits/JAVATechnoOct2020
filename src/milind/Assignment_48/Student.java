package milind.Assignment_48;

public class Student implements Comparable<Student>{
	
	int studentID;
	String studentName;
	char studentStd;
	
	public Student(int studentID, String studentName, char studentStd) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentStd = studentStd;
	}

	@Override
	public int compareTo(Student o) {
		return this.studentName.compareTo(o.studentName);
	}
	
	public String toString() {
		return studentID + " : " + studentName + " : " + studentStd;
	}


}
