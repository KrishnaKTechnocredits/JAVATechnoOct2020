package suresh;

public class Student {
	
	
	void studentName(String name) {
		System.out.println("Name of Student: " + name);
		
	}
	void gainedmarks(int marks) {
		if(marks>90) {
			System.out.println("Student Gained : A+ grade");
		}
		else if(marks <90 && marks > 80) {
			System.out.println("Student Gained : A grade");
		}
		else if(marks <80 && marks > 70) {
			System.out.println("Student Gained : B+ grade");
		}
		else if(marks <70 && marks > 60) {
			System.out.println("Student Gained : B grade");
		}
		else if (marks<60)
			System.out.println("Student Gained : C grade");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.studentName("Suresh");
		student.gainedmarks(99);
		student.studentName("Pavan");
		student.gainedmarks(89);
		
	}

}
