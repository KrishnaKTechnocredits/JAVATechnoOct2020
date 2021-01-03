package kajol.SortingUsingComparable;

public class SortStudents implements Comparable<SortStudents> {
	int studentId,studentStd;
	String studentName; 

	public SortStudents(String studentName, int studentId, int studentStd) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentStd=studentStd;
	}
	
	@Override
	public int compareTo(SortStudents s) {
		return this.studentName.compareTo(s.studentName);
	}
	
	@Override
	public String toString() {
		return "Student Name : "+studentName+" Student Id : "+studentId+" Student Standard : "+studentStd;
	}
}
