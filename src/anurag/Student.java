package anurag;

public class Student {
	
	String name;
	
	void StudentName(String name) {
		this.name=name;
	    }
	void GainedMarks(int marks) {
		String grade;
		
		if(marks > 90) {
			grade = "A+" ;
			System.out.println("Student Name is " + name + " and Grade is" + grade);
		}
	
		else if(marks > 80 && marks <= 90) {
			grade = "A";
			System.out.println("Student Name is " + name + " and Grade is " + grade);
		}
		
		else if(marks > 70 && marks <= 80) {
			grade = "B+";
			System.out.println("Student Name is " + name + " and Grade is " + grade);
		}
		
		else if(marks>=60 && marks<=70) {
			grade = "B";
			System.out.println("Student Name is " + name + " and Grade is " + grade);
		}
		else {
			grade = "C";
			System.out.println("Student Name is " + name + " and Grade is " + grade);
		}	
		
		}
		
		public static void main(String[] args) {
			Student student1 = new Student();
			student1.StudentName("komal");
			student1.GainedMarks(90);
			
		}	
}
