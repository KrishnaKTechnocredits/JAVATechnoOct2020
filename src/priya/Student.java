package priya;

public class Student {

	String name;
	
	void studentName(String name) {
		this.name = name;
	}
	
	 void gainMark(double marksInPercentage) {
		 if (marksInPercentage>=90) {
			 System.out.println(name+ " : Grade A+");
			 }
		 else if(marksInPercentage < 90 && marksInPercentage >=80) {
			 System.out.println(name+ " : Grade A");
			 }
		 else if(marksInPercentage < 80 && marksInPercentage >=70) {
			 System.out.println(name+ " : Grade B+");
			 }
		 else if(marksInPercentage < 70 && marksInPercentage >=60) {
			 System.out.println(name+ " : Grade B");
			 }
		 else {
			 System.out.println(name+ " :Grade C");
		 }
	 }
	 public static void main(String[] args) {
		 Student student = new Student();
		 student.studentName("Priya");
		 student.gainMark(76);		 
	 }
	 
}
