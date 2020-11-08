package yogita;

public class Student {
	  String studName;

	void studentName(String studName) {
		this.studName = studName;
	 }
	
	 void gainedMarks(int marks) {
		System.out.println("Obtained Marks " +marks);
		if(marks >=90)
		   System.out.println(studName + " has secured A+ grade");
		else if(marks >=80)
		   System.out.println(studName + " has secured A grade");
		else if(marks >=70)
		   System.out.println(studName + " has secured B+ grade");
		else if(marks >=60)
		   System.out.println(studName + " has secured B grade");
		else 
		   System.out.println(studName + " has secured C grade");
	}
	 
public static void main(String[] args) {
           Student student = new Student();
           student.studentName("yogita");
           student.gainedMarks(65);
    }
}
