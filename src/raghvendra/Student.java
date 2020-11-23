package raghvendra;

public class Student {
	
	String studentName;

	void studentName(String studentName) {
		this.studentName=studentName;
	}
	
	void gainedMar(int marksPercentage) {
		
		if (marksPercentage>90)
			System.out.println(studentName+" marks is above 90% with garde A+");
		else if (marksPercentage<=90 && marksPercentage>=80)
			System.out.println(studentName+ " garde A+");
		else if (marksPercentage<80 && marksPercentage>=70)
			System.out.println(studentName+" garde B+");
		else if (marksPercentage<70 && marksPercentage>=60)
			System.out.println(studentName+"garde B+");
		else
			System.out.println(studentName+" garde C+");
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		student.studentName("Raghvendra");
		student.gainedMar(90);
	}
	
	
}
