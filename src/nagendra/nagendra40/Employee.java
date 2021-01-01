package nagendra.nagendra40;

import java.util.Scanner;

/*
Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); 
*/

public class Employee {

	String empName;
	int deptId;
	double salary;

	public Employee(String name, int id, double empSalary) {
		empName = name;
		deptId = id;
		salary = empSalary;
	}

	void compareEmpSalary(Employee e1, Employee e2) {
		if (e1.salary > e2.salary) 
			System.out.println("The Employee Name is :  " + e1.empName + " Department Id is : " + e1.deptId
					+ " Salary :" + e1.salary + " ");
			System.out.println("The Employee Name is :  " + e2.empName + " Department Id is : " + e2.deptId
					+ " Salary :" + e2.salary + " ");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		int deptId = sc.nextInt();
		double salary = sc.nextDouble();
		Employee e1 = new Employee(empName, deptId, salary);
		String empName1 = sc.next();
		int deptId1 = sc.nextInt();
		double salary1 = sc.nextDouble();
		Employee e2 = new Employee(empName1, deptId1, salary1);
		e1.compareEmpSalary(e1, e2);
		sc.close();
	}
}
