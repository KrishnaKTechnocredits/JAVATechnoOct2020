package technoCredits.constructor;

public class Student {
	int number;
	
	Student(){
		
	}
	
	Student(int number){
		
	}

	static void display(int x) {
		number = x;
		System.out.println("Hi : " + number); //4
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(10); // 1 // 5
		System.out.println("Techno"); // 6
		display(100);
	
	}
}
