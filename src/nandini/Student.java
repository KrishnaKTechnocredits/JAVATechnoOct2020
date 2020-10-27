package nandini;

public class Student {
	String nameOfStudent;
	int marks;
	
	void studentName(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	
	void gainedMark(int marks) {
		this.marks = marks;
	}
	
	void displayResult() {
		if(marks >= 90) 
			System.out.println(nameOfStudent+" has secured A+ grade");
		else if(marks >= 80 && marks < 90)
			System.out.println(nameOfStudent+" has secured A grade");
		else if(marks >= 70 && marks < 80)
			System.out.println(nameOfStudent+" has secured B+ grade");
		else if(marks >= 60 && marks < 70)
			System.out.println(nameOfStudent+" has scored B grade");
		else if(marks <= 60)
			System.out.println(nameOfStudent+" has scored C grade");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Nandini");
		student.gainedMark(92);
		student.displayResult();		
	}
}
