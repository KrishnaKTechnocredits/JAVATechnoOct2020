package monika;
/* *Assignment - 41
Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. 
*/

import java.util.ArrayList;

public class EmployeeMinimumSalary {

	String firstName, lastName, empDeptName;
	int age, empId, empDeptId;
	double salary;

	EmployeeMinimumSalary(String firstName, String lastName, String empDeptName, int age, int empId, int empDeptId, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.empId = empId;
		this.empDeptName = empDeptName;
		this.empDeptId = empDeptId;
		this.salary = salary;
	}

	public String toString() {
		System.out.println("Employee Details");
		return "Name Of Employee:" + firstName + " " + lastName + "\nDepartment_Name:" + empDeptName + "\nAge:" + age
				+ "\nEmp_ID:" + empId + "\nDepartment_ID:" + empDeptId + "\nSalary:" + salary;
	}

	public static EmployeeMinimumSalary findMinimumSalary(ArrayList<EmployeeMinimumSalary> empList) {
		double minimumSalary = empList.get(0).salary;
		int minIndex = 0;
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).salary < minimumSalary) {
				minimumSalary = empList.get(i).salary;
				minIndex = i;
			}
		}
		return empList.get(minIndex);
	}

	public static void main(String[] args) {
		ArrayList<EmployeeMinimumSalary> empDetails = new ArrayList<EmployeeMinimumSalary>();
		EmployeeMinimumSalary emp1 = new EmployeeMinimumSalary("Monika", "sethi", "Implementation", 27, 300, 1, 55000);
		EmployeeMinimumSalary emp2 = new EmployeeMinimumSalary("Sonia", "se", "finance", 28, 102, 2, 60000);
		EmployeeMinimumSalary emp3 = new EmployeeMinimumSalary("karan", "Kapoor", "Devops", 24, 103, 3, 45000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);

		System.out.println(EmployeeMinimumSalary.findMinimumSalary(empDetails));
	}
} 
