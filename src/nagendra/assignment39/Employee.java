package nagendra.assignment39;

/*
Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. 
Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
*/

public class Employee {

	String employeeName;
	int employeeId;
	int experience;
	double empSalary;

	public Employee(String empName, int empId, int yearsOfExperience, double salary) {
		employeeName = empName;
		employeeId = empId;
		experience = yearsOfExperience;
		empSalary = salary;
	}

	void displayDetails() {
		System.out.println("Employee Name is :" + employeeName);
		System.out.println("Employee Id  is :" + employeeId);
		System.out.println("Employee Years of experience is :" + experience);
		System.out.println("Employee Salary is :" + empSalary);
	}

	boolean isEligible() {

		if (empSalary > 30000)
			return true;
		return false;
	}
	boolean isSwitchRequired(){
		if(experience*200000 < empSalary)
			return true;
		return false; 
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Nagendra", 121, 5, 2001);
		emp.displayDetails();
		System.out.println(emp.isEligible());
		System.out.println(emp.isSwitchRequired());
	}
}
