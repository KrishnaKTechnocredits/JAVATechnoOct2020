package technoCredits.communicationBtwClasses;

public class Client {
	void m1() {
		System.out.println("Ankit");
	}

	public static void main(String[] args) {
		Manager.deptId = 10101;
		Manager manager = new Manager();
		manager.setData(1, "Dhara");
		Manager.displayInfo();
		
		Employee.empDeptId = 12129;
		Employee.printEmpDeptInfo();
		
	}
}
