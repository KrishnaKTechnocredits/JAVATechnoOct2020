/*Assignment - 40
Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); */

package shrutiS.assignment40;

import java.util.Scanner;

public class Employee {

	String empName;
	int deptId;
	int salary;

	Employee(String empName, int deptId, int salary) {
		this.deptId = deptId;
		this.empName = empName;
		this.salary = salary;
	}

	static void compareEmpSalary(Employee e1, Employee e2) {
		if (e1.salary > e2.salary) {
			System.out.println("Employee name:" + e1.empName);
			System.out.println("Employee dept Id:" + e1.deptId);
			System.out.println("Employee name:" + e1.salary);
		} else {
			System.out.println("Employee name:" + e2.empName);
			System.out.println("Employee dept Id:" + e2.deptId);
			System.out.println("Employee name:" + e2.salary);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empName = "";
		int deptId = 0;
		int salary = 0;
		System.out.println("Enter employee 1 information");
		System.out.println("Please enter employee name:");
		empName = sc.next();
		System.out.println("Please enter employee dept Id:");
		deptId = sc.nextInt();
		System.out.println("Please enter employee salary:");
		salary = sc.nextInt();
		Employee e1 = new Employee(empName, deptId, salary);

		System.out.println("Enter employee 2 information");
		System.out.println("Please enter employee name:");
		empName = sc.next();
		System.out.println("Please enter employee dept Id:");
		deptId = sc.nextInt();
		System.out.println("Please enter employee salary:");
		salary = sc.nextInt();
		Employee e2 = new Employee(empName, deptId, salary);
		Employee.compareEmpSalary(e1, e2);
	}
}
