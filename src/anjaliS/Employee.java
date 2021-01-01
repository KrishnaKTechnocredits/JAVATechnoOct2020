package anjaliS;

import java.util.Scanner;

public class Employee {
	int empId;
	String empName;
	int yearsOfExperience;
	int salary;

	Employee(int empId, String empName, int yearsOfExperience, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;

	}

	void displayEmployeeDetails() {
		System.out.println("EmpId of employee: " + empId);
		System.out.println("EmpName of employee: " + empName);
		System.out.println("Experience of employee: " + yearsOfExperience);
		System.out.println("Salary of employee: " + salary);

	}

	boolean isEligible() {
		if (salary > 30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if (!(yearsOfExperience * 200000 < salary))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String Name = sc.nextLine();
		System.out.println("Enter employee Id");
		int Id = sc.nextInt();
		System.out.println("Enter experience: ");
		int experience = sc.nextInt();
		System.out.println("Enter Salary: ");
		int empSalary = sc.nextInt();
		Employee employee = new Employee(Id, Name, experience, empSalary);
		employee.displayEmployeeDetails();
		employee.isEligible();
		if (employee.isEligible()) {
			System.out.println("Yes employee is eligible: ");
		}
		employee.isSwitchRequired();
		if (employee.isSwitchRequired()) {
			System.out.println("Yes switch required: ");

		}
	}

}