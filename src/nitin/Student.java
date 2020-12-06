/*Create a class named as Student, which have methods like below
	a. studentName()
	b. gainedMark()

	Expectations:
	• If student gain mark above 90% display student name with grade A+
	• If student gain marks between 80% to 90% display name with grade A
	• If student gain marks between 70% to 80% display name with grade B+
	• If student gain marks between 60% to 70% display name with grade B
	• If student gain marks below 60% display name with grade C
 * */
package nitin;

public class Student {
	int marks;
	String grade;

	void studentName(String studentName) {
		System.out.print(studentName + " Got");
	}

	void gainedMark(int marks) {
		if (marks > 90)
			System.out.print(" A+ Grade.");
		else if (marks > 80 && marks < 90)
			System.out.print(" A Grade.");
		else if (marks > 70 && marks < 80)
			System.out.print(" B+ Grade.");
		else if (marks > 60 && marks < 70)
			System.out.print(" B Grade.");
		else if (marks < 60)
			System.out.print(" C Grade.");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Nitin");
		student.gainedMark(89);
		// student.displayInfo();
	}
}
