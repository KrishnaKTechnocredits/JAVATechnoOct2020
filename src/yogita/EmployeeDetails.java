/*
Program : 1 

Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. 
Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.

*/

package yogita;

public class EmployeeDetails {
	int empId, salary;
	double yearsOfExp;
	String empName;

	EmployeeDetails(int empId, String empName, double yearsOfExp, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExp = yearsOfExp;
		this.salary = salary;
	}

	void displayEmpDetails()

	{
		System.out.println("Employee Id:" + empId + " \nEmployee Name:" + empName + "\nYears OF Experience:"
				+ yearsOfExp + " years" + "\nSalary:" + " Rs." + salary);
	}

	boolean isEligible() {
		if (salary > 30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if (yearsOfExp * 200000 < salary)
			return true;
		return false;
	}

	public static void main(String[] args) {

		EmployeeDetails empDetails = new EmployeeDetails(101, "Yogita", 2.5, 45000);
		System.out.println("Employee Detail Information");
		empDetails.displayEmpDetails();
		System.out.println("Is Eligible:" + empDetails.isEligible());
		System.out.println("Is Switch Required:" + empDetails.isSwitchRequired());

	}

}
