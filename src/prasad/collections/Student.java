package prasad.collections;

/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/
public class Student implements Comparable {

	private String studentName;
	private int studentId;
	private int studentStd;

	public Student(String name, int id, int std) {
		this.studentName = name;
		this.studentId = id;
		this.studentStd = std;
	}

	@Override
	public int compareTo(Object arg0) {
		Student std = (Student) arg0;
		return this.studentName.compareTo(std.studentName);
	}

	@Override
	public String toString() {

		return studentName + " : " + studentId + " : " + studentStd;
	}

}
