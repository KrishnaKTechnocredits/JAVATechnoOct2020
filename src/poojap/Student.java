package poojap;

public class Student {
	
	int marks;
	String name;
	
	void studentName(String name) {
		this.name=name;
		
	}
	 void gainedMark(int marks) {
		 
		 if(marks>90)
			 System.out.println(name +" got grade A+");
		 else if(marks > 80 && marks < 90)
			 System.out.println(name + " got grade A");
		 else if(marks > 70 && marks < 80)
			 System.out.println(name + " got grade B+");
		 else if(marks > 60 && marks < 70)
			 System.out.println(name + "got grade B");
		 else if(marks<60)
			 System.out.println(name + " got grade C");
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentName("pooja");
		student.gainedMark(85);
	}
}
