package ritika.Assignments.asgmt_41;

import java.util.Scanner;

/*Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, salary, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.
*/
public class Employee {

	private String firstName;
	private String lastName;
	private String deptName;
	private int empId;
	private int empDeptId;
	private int empAge;
	private int empSalary;

	public Employee(String firstName, String lastName, String deptName, int empDeptId, int empId, int empSalary, int empAge) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
		this.empDeptId = empDeptId;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}

	int getSalary() {
		return this.empSalary;
	}

	String getName() {
		return firstName + " " + lastName;
	}

	int getAge() {
		return empAge;
	}

	@Override
	public String toString() {
		return "Name -> " + firstName + " " + lastName + " | Department -> " + deptName + " | Department ID -> "
				+ empDeptId + " | Employee ID -> " + empId + " | Salary -> " + empSalary + " | Age -> " + empAge;
	}
}
