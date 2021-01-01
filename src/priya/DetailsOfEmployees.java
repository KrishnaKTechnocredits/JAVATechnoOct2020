//Assignment - 39 : 16th Dec'2020
//Program : 1 :Create Employee class and parameterized constructor with attributes empId , empName,
//years of Experience and salary. Write a method to display the details of employees. Create a method isEligible which will return true if Employee salary is more than 30000. Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.

package priya;

public class DetailsOfEmployees {
	int empId;
	String empName;
	double yearsOfExp;
	int empSalary;

	DetailsOfEmployees(int empId, String empName, double yearsOfExp, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExp = yearsOfExp;
		this.empSalary = empSalary;
	}

	void employeesDetails() {
		System.out.println("Employee Name is: " + empName);
		System.out.println("Emp ID is: " + empId);
		System.out.println("Years of experience is: " + yearsOfExp);
		System.out.println("Salary is: " + empSalary);
		System.out.println("Is Employee eligible? -> " + isEligible());
		System.out.println("Is Switch required? -> " + isSwitchRequired());
	}

	boolean isEligible() {
		if (empSalary > 30000)
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
		DetailsOfEmployees detailsofemp = new DetailsOfEmployees(210145, "Priya", 10.5, 755000);
		detailsofemp.employeesDetails();
	}
}
