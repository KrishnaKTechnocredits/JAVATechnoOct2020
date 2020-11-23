package ankita.assignment.scenarioBasedProgram;

public class Student {
	String studentName;
	
	void studentName(String studentName1) {
		studentName = studentName1;
	}
	void gainedMark(int studentMark1) {
		if(studentMark1 >= 90)
			System.out.println(studentName + " Grade A+");
		else if(studentMark1 >= 80)
			System.out.println(studentName + " Grade A");
		else if(studentMark1 >= 70)
			System.out.println(studentName + " Grade B+");
		else if(studentMark1 >= 60)
			System.out.println(studentName + " Grade B");
		else
			System.out.println(studentName + " Grade C");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Ankita");
		student.gainedMark(55);
	}
}
