package ritika;

/* 2. Create a class named as Student, which have methods like below
a. studentName()
b. gainedMark()

Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C
*/
class Student {
	String name;
	void studentName(String name) {
		this.name = name;
	}
	void gainedMark(int marks) {
		if (marks>90)
			System.out.println(name + "'s grade is A+");
		else if (marks>80)
			System.out.println(name + "'s grade is A");
		else if (marks>70)
			System.out.println(name + "'s grade is B+");
		else if (marks>60)
			System.out.println(name + "'s grade is B");
		else 
			System.out.println(name + "'s grade is C");
	}
	public static void main (String[] args) {
		Student student = new Student();
		student.studentName("Ritika");
		student.gainedMark(95);
		student.studentName("John");
		student.gainedMark(88);
		student.studentName("Jacob");
		student.gainedMark(55);
	}
}