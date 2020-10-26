package tejashree;

public class Student {
	String sName;
	
	void studentName(String sName) {
		this.sName=sName;
	}
	void gainedMarks(int marks) {
		if(marks>90) {
			System.out.println(sName+" has recieved grade A+");
		}else if(marks>=80 && marks<90) {
			System.out.println(sName+" has recieved grade A");
		}else if(marks>=70 && marks<80) {
			System.out.println(sName+" has recieved grade B+");
		}else if(marks>=60 && marks<70) {
			System.out.println(sName+" has recieved grade B");
		}else if(marks<60) {
			System.out.println(sName+" has recieved grade C");
		}
			
	}
	public static void main(String[] args) {
		Student student =new Student();
		student.studentName("Rama");
		student.gainedMarks(85);
	}
}
