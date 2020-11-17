package suvela;
	
public class Student {
	String studentName;
	int marks;
	void studentName(String studentName) {
		this.studentName = studentName;
	}
	void gainedMark(int marks) {
		this.marks = marks;
		if (marks >90)
			System.out.println(studentName + " got Grade A+");
		else if (marks >80 && marks <90)
			System.out.println(studentName + " got Grade A");
		else if(marks >70 && marks <80)
			System.out.println(studentName + " got Grade B+");
		else if(marks >60 && marks <70)
			System.out.println(studentName + " got Grade B");
		else if(marks <60)
			System.out.println(studentName + " got Grade C");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Vijay");
		student.gainedMark(50);
		student.studentName("Ajay");
		student.gainedMark(79);
	}

}
