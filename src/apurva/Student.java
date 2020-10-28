package apurva;

class Student{
	void studentName(String studentName) {
		System.out.println(studentName);
	}
	void gainedMark(int gainedMark){
	
	if (gainedMark>90)
		System.out.print("Grade A+");
	
	else if (gainedMark<=90 && gainedMark>=80)
		System.out.print("Grade A");
	
	else if (gainedMark<80 && gainedMark>=70)
		System.out.print("Grade B+");
		
	else if (gainedMark<70 && gainedMark>=60)
		System.out.print("Grade B");
	
	else if (gainedMark<60)
		System.out.print("Grade C");
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Apurva");
		student.gainedMark(84);
	}
}