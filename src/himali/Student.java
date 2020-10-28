package himali;

public class Student {
	
	String studentName;
	int marks;
	
	void studentName(String sname)
	{
		this.studentName=sname;
		
	}
	void gainedMark(int marks)
	{
		if(marks>90) {
			System.out.println(studentName +" get grade A+");
		}else if(marks>80 && marks<=90) {
			System.out.println(studentName +" get grade A");
		}else if(marks>70 && marks<=80) {
			System.out.println(studentName +" get grade B+");
		}else if(marks>60 && marks<=70) {
			System.out.println(studentName +" get grade B");
		}else if(marks<60) {
			System.out.println(studentName +" get grade C");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.studentName("ABC");
		student.gainedMark(55);
		

	}

}
