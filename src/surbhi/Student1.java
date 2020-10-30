package surbhi;
/*
 * a. studentName()
	b. gainedMark()

	Expectations:
	• If student gain mark above 90% display student name with grade A+
	• If student gain marks between 80% to 90% display name with grade A
	• If student gain marks between 70% to 80% display name with grade B+
	• If student gain marks between 60% to 70% display name with grade B
	• If student gain marks below 60% display name with grade C

 */
public class Student1 {
	String studentname;
	int gainmark;

	void studentName(String studentname) {
		this.studentname = studentname;

	}

	void gainedMark(int gainmark) {
		this.gainmark = gainmark;
	}

	void display() {

		if (gainmark > 90) {
			System.out.println(studentname + " garde A+");
		} else if (gainmark > 80) {
			System.out.println(studentname + " garde A+");
		} else if (gainmark > 70) {
			System.out.println(studentname + " garde B+");
		} else if (gainmark > 60) {
			System.out.println(studentname + " garde B");
		} else if (gainmark < 60) {
			System.out.println(studentname + " garde C");
		}
	}

	public static void main(String[] args) {
		Student1 student = new Student1();
		student.studentName("Surbhi");
		student.gainedMark(95);
		student.gainedMark(85);
		student.gainedMark(78);
		student.gainedMark(65);
		student.display();

	}

}
