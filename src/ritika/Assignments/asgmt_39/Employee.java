package ritika.Assignments.asgmt_39;

/*Assignment - 39 : 16th Dec'2020

Program : 1
Create Employee class and parameterized constructor with attributes empId , empName, years of Experience and salary. Write a method to display the details of employees. Create a method isEligible which will return true if Employee salary is more than 30000. Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
*/
public class Employee {

	int empId;
	String empName;
	double yearsOfExp;
	int empSalary;

	Employee(int empId, String empName, double yearsOfExp, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExp = yearsOfExp;
		this.empSalary = empSalary;
	}

	void displayEmployeeDetails() {
		System.out.println("Employee Name is: " + empName);
		System.out.println("Employee ID is: " + empId);
		System.out.println("Employee's years of experience is: " + yearsOfExp);
		System.out.println("Employee's Salary is: " + empSalary);
		System.out.println("Is Employee eligible? -> " + isEligible());
		System.out.println("Is Switch required? -> " + isSwitchRequired());
	}

	boolean isEligible() {
		if (empSalary > 300000)
			return true;
		else
			return false;
	}

	boolean isSwitchRequired() {
		if ((yearsOfExp * 200000) < empSalary)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(123456, "Ritika", 5.5, 500000);
		emp1.displayEmployeeDetails();
	}
}
