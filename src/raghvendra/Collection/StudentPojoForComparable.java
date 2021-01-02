package raghvendra.Collection;
//This is an Java POJO CLASS
public class StudentPojoForComparable implements Comparable<StudentPojoForComparable>  {
	int studentId; 
	String studentName;
	int studentStd;
	StudentPojoForComparable(int studentId, String studentName,int studentStd){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentStd=studentStd;
	}
	
	public int compareTo(StudentPojoForComparable empDetailsPojo) {
		return this.studentName.compareTo(empDetailsPojo.studentName);
	}
	
	public String toString() {
		return "Student Name : "+studentName + " Student ID : " + studentId + " Student Standard : " + studentStd+"\n";
	}
}
