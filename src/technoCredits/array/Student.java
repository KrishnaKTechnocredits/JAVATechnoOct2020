package technoCredits.array;

public class Student {
	int id;
	String name;
	
	void setData() {
		id = 10;
		name = "Maulik";
	}
	
	void display() {
		System.out.println("Name " + name);
		System.out.println("Id " + id);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		student.name = "Vishakha";
		student.setData();
		student.name = "Rohan";
		student.setData();
		student.name = "Vaibhav";
		student.setData();
		student.display();
		
		
	}
}
