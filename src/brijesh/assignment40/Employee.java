package brijesh.assignment40;

/**
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.
*/

import java.util.Scanner;

public class Employee {
	String empName;
	int deptID;
	int salary;
	
	public Employee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Employee Name:");
		empName=scanner.next();
		System.out.println("Please enter Department ID:");
		deptID=scanner.nextInt();
		System.out.println("Please enter salary:");
		salary=scanner.nextInt();
	}
	
	static void compareEmpSalary(Employee e1, Employee e2) {
		if(e1.salary>e2.salary)
			System.out.println("Employee "+e1.empName+" has max salary, department Id: "+e1.deptID+", salary: "+e1.salary);
		else if(e2.salary>e1.salary)
			System.out.println("Employee "+e2.empName+" has max salary, department Id: "+e2.deptID+", salary: "+e2.salary);
		else
			System.out.println("Both the employee has same salary");
	}

	public static void main(String[] args) {
		Employee employee1 =new Employee();
		Employee employee2 = new Employee();
		Employee.compareEmpSalary(employee1, employee2);
	}
}
