package technoCredits.oops.tricky;

public class Employee extends Manager {
	
	
	static void m1() {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.m1(); // 1
		
		Employee e1 = new Employee();
		e1.m1();// 2
		
		Manager mng1 = new Employee();
		mng1.m1(); // 1
		
		Manager.m1(); // 
		Employee.m1();// 
	}
	
}
