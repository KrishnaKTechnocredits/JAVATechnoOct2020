package rohan;

public class Student {
	
	int marksScored;
	String sname;
	
	void studentName(String sname) {
		this.sname = sname;
	}
	void gainedMark(int marksScored) {
		if(marksScored > 90)
			System.out.println(sname + " scored grade A+");
		else if(marksScored > 80 && marksScored < 90)
			System.out.println(sname+" scored grade A");
		else if(marksScored > 70 && marksScored < 80)
			System.out.println(sname+" scored grade B+");
		else if(marksScored > 60 && marksScored < 70)
			System.out.println(sname+" scored grade B");
		else
			System.out.println(sname + " scored grade C");
	}
	public static void main(String[] a) {
		Student student = new Student();
		student.studentName("Rohan");
		student.gainedMark(78);
		student.studentName("vaibhav");
		student.gainedMark(99);
		student.studentName("Vishakha");
		student.gainedMark(47);
		student.studentName("prashant");
		student.gainedMark(85);
	}
}
