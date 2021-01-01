/*
 Assignment - 40: 16th Dec'2020 

Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); 
 */

package yogita;

import java.util.Scanner;

public class Employee {

	String empName;
	int deptId;
	double salary;

	Employee(String empName, int deptId, double salary) {
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
	}

	void compareEmpSalary(Employee emp1, Employee emp2) {
		if (emp1.salary > emp2.salary) {
			System.out.println("Name of Employee:" + emp1.empName);
			System.out.println("Department ID:" + emp1.deptId);
			System.out.println("Salary Is:" + emp1.salary);
		} else if (emp1.salary < emp2.salary) {
			System.out.println("Name of Employee:" + emp2.empName);
			System.out.println("Department ID:" + emp2.deptId);
			System.out.println("Salary Is:" + emp2.salary);

		} else {
			System.out.println("Both Employee Having Same Salary");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of First Employee");
		String name1 = sc.next();
		System.out.println("Enter Department of First ID");
		int departmentId1 = sc.nextInt();
		System.out.println("Enter Salary of of First Employee");
		double empSalary1 = sc.nextDouble();
		Employee e1 = new Employee(name1, departmentId1, empSalary1);
		System.out.println("Enter Name of Second Employee");
		String name2 = sc.next();
		System.out.println("Enter Department of Second ID");
		int departmentId2 = sc.nextInt();
		System.out.println("Enter Salary of Second Employee");
		double empSalary2 = sc.nextDouble();
		Employee e2 = new Employee(name2, departmentId2, empSalary2);
		e1.compareEmpSalary(e1, e2);

	}

}
