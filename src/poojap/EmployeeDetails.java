/*Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. 
*/
package poojap;

import java.util.ArrayList;

public class EmployeeDetails {
	String firstName, middleName, surName, empDeptName;
	int empId, empDeptId, age, salary;

	public EmployeeDetails(String firstName, String surName, String empDeptName, int age, int empId, int empDeptId,
			int salary) {
		this.firstName = firstName;
		this.surName = surName;
		this.empDeptName = empDeptName;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		System.out.println("Employee Details Are :");
		return "Employee Name is : " + firstName + " " + surName + "\nDepartment Name is : " + empDeptName
				+ "\nEmployee Age is : " + age + "\nEmpId is : " + empId + "\nDeptId is : " + empDeptId
				+ "\nEmployee Salary is : " + salary;
	}

	static EmployeeDetails findMinimumSalary(ArrayList<EmployeeDetails> employeeDetails) {
		int minimumSalary = employeeDetails.get(0).salary;
		int minIndex = 0;
		for (int i = 0; i < employeeDetails.size(); i++) {
			if (employeeDetails.get(i).salary < minimumSalary) {
				minimumSalary = employeeDetails.get(i).salary;
				minIndex = i;
			}
		}
		return employeeDetails.get(minIndex);
	}

	public static void main(String[] args) {
		ArrayList<EmployeeDetails> empdetails = new ArrayList<EmployeeDetails>();
		EmployeeDetails emp1 = new EmployeeDetails("Pooja", "Pekhale", "testing", 26, 10561, 101, 30000);
		EmployeeDetails emp2 = new EmployeeDetails("Yogita", "Pawale", "testing", 40, 10560, 105, 35000);
		EmployeeDetails emp3 = new EmployeeDetails("Madhuri", "Rajole", "testing", 28, 10561, 101, 25000);
		empdetails.add(emp1);
		empdetails.add(emp2);
		empdetails.add(emp3);
		System.out.println(EmployeeDetails.findMinimumSalary(empdetails));
	}
}
