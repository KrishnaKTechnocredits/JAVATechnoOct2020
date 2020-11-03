package deepak;

public class Student {
	
	String name;
	
	void studentName(String stdName) {
		
		name = stdName;
	}
	
	void gainedMark(int marks) {
		
		if(marks > 90) {
			
			System.out.println(name +" received "+ "A+");
		}
		else if(marks >= 80 && marks <= 90 ){
			
			System.out.println(name + " received "+ "A");
		}
		else if( marks >=70 && marks < 80) {
			
			System.out.println(name + " received "+ "B+");
		}
		else if( marks >=60 && marks < 70) {
			
			System.out.println(name + " received "+ "B");
		}
		else if( marks < 60) {
			
			System.out.println(name + " received "+ "C");
		}	
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.studentName("Deepak");
		student.gainedMark(59);
		

	}

}
