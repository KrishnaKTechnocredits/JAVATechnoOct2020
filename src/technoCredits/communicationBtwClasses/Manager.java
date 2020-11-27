package technoCredits.communicationBtwClasses;

public class Manager {

	static int deptId;
	int managerId;
	String managerName;
	
	void setData(int managerId, String managerName) {
		this.managerId = managerId;
		this.managerName = managerName;
	}
	
	static void displayInfo() {
		System.out.println(Manager.deptId); // managerId
	}
	
	void displayEmployeeInfo() {
		Employee employee = new Employee();
		System.out.println("Empployee name is : " + employee.empId);
		System.out.println("Employee name is :" + employee.empName);
	}
}
