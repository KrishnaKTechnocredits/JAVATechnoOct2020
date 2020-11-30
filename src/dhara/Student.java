package dhara;

public class Student {

	String studentName;
	
	void studentName(String studentName) {
		
		this.studentName=studentName;
	}
	
	void gainedMark(int marks) {
		
		if(marks>90)
			System.out.println(studentName+" : Grade A+");
		
		else if(marks<90 && marks>80)
			System.out.println(studentName+" : Grade A");
		
		else if(marks<80 && marks>70)
			System.out.println(studentName+" : Grade B+");
		
		else if(marks<70 && marks>60)
			System.out.println(studentName+" : Grade B");
		
		else if(marks<60)
			System.out.println(studentName+" : Grade c");
	
	}
	
	public static void main(String[] args) {
		
		Student student=new Student();
		student.studentName("Dhara");
		student.gainedMark(65);
	}
}
