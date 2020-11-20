package prasad;

public class StudentMarks {
	String studentName;
	int marks;
	Boolean flag;
	
	void studentDetails(String name , int marks) {
		studentName = name;
		this.marks = marks;
	}
	
	void gainedMarks() {
		if(marks>=90) {
			flag=true;
			System.out.println(studentName + " has secured A+ grade.");
		}else if(marks>=80 && marks<90) {
			flag=true;
			System.out.println(studentName + " has secured A grade.");
		}else if(marks>=70 && marks<80) {
			flag=true;
			System.out.println(studentName + " has secured B+ grade.");
		}else if(marks>=60 && marks<70) {
			flag=true;
			System.out.println(studentName + " has secured B grade.");
		}else if(marks<60) {
			flag=true;
			System.out.println(studentName + " has secured C grade.");
		}if(flag)
			 System.out.println("Student result was processed successfully.");
	}
	
	public static void main (String[] arg) {
		StudentMarks studentmarks = new StudentMarks();
		studentmarks.studentDetails("Alan", 82);
		studentmarks.gainedMarks();
	}
}
