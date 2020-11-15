package technoCredits.communicationBtwClasses;

public class Employee {
	
	int empId;
	String empName;
	static int empDeptId;
	
	void setEmpId(int empId) {
		this.empId = empId;
	}
	
	void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDeptId(int empDeptId) {
		Employee.empDeptId = empDeptId;
	}

	static void printEmpDeptInfo() {
		System.out.println("Employee DeptId is " + Employee.empDeptId);
	}
	
}
