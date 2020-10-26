package shrutiS;

public class Student {
	String studentName;
	int studentMarks;

	void studentName(String studentName) {
		this.studentName = studentName;
	}

	void gainedMark(int studentmarks) {
		if (studentmarks > 90)
			System.out.println(studentName + " got A+ grade");
		else if (studentmarks > 80)
			System.out.println(studentName + " got A grade");
		else if (studentmarks > 70)
			System.out.println(studentName + " got B+ grade");
		else if (studentmarks > 60)
			System.out.println(studentName + " got B grade");
		else
			System.out.println(studentName + " got C grade");

	}

	public static void main(String[] a) {
		Student student = new Student();
		student.studentName("Shikha");
		student.gainedMark(71);
	}
}
