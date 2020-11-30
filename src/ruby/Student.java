/*	Create a class named as Student, which have methods like below
	a. studentName()
	b. gainedMark()

	Expectations:
	• If student gain mark above 90% display student name with grade A+
	• If student gain marks between 80% to 90% display name with grade A
	• If student gain marks between 70% to 80% display name with grade B+
	• If student gain marks between 60% to 70% display name with grade B
	• If student gain marks below 60% display name with grade C */

package ruby;

public class Student {
	String name;
	int marks;
	
	void studentName(String name) {
		this.name = name;
	}
	
	void gainedMark(int marks) {
		this.marks = marks;
	}
	
	void displayResult() {
		if(marks >= 90) 
			System.out.println(name+" has scored grade A+ ");
		else if(marks >= 80 && marks < 90)
			System.out.println(name+" has scored grade A ");
		else if(marks >= 70 && marks < 80)
			System.out.println(name+" has scored grade B+ ");
		else if(marks >= 60 && marks < 70)
			System.out.println(name+" has scored grade B ");
		else if(marks <= 60)
			System.out.println(name+" has scored grade C ");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Ruby");
		student.gainedMark(89);
		student.displayResult();	
	}
}
