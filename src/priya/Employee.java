//Assignment - 40: 16th Dec'2020 
//Program - 1: Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
//Create 3 parameterized constructor for same.
//Take data for 2 employees and write a method which takes 2 arguments (instance of both
//employees) and print all the details of employee having max salary.
//HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); 

package priya;

import java.util.Scanner;

public class Employee {

	String empname;
	int depId;
	int salary;

	Employee(String employeeName, int depId, int salary) {
		this.empname = employeeName;
		this.depId = depId;
		this.salary = salary;
	}

	void compareEmpSalary(Employee employee1, Employee employee2) {
		if (employee1.salary > employee2.salary) {
			System.out.println(employee1.empname);
			System.out.println(employee1.depId);
			System.out.println(employee1.salary);
		} else {
			System.out.println(employee2.empname);
			System.out.println(employee2.depId);
			System.out.println(employee2.salary);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the depId: ");
		int depId = sc.nextInt();
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		sc.nextLine();
		Employee employee1 = new Employee(name, depId, salary);
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Enter the depId: ");
		depId = sc.nextInt();
		System.out.println("Enter the salary: ");
		salary = sc.nextInt();
		Employee employee2 = new Employee(name, depId, salary);
		employee1.compareEmpSalary(employee1, employee2);
		sc.close();
	}
}
