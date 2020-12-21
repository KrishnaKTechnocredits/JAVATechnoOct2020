/*Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.
*/
package poojap;

import java.util.Scanner;

public class Employee_Assignment_40 {
	String empName;
	int depId, salary;

	public Employee_Assignment_40(String EmpName, int DeptId, int Salary) {
		this.empName = EmpName;
		this.depId = DeptId;
		this.salary = Salary;
	}

	void compareMaxSalary(Employee_Assignment_40 e1, Employee_Assignment_40 e2) {
		if (e1.salary > e2.salary) {
			System.out.println("Name of Employee:" + e1.empName);
			System.out.println("Department ID:" + e1.depId);
			System.out.println("Salary Is:" + e1.salary);
		} else if (e1.salary < e2.salary) {
			System.out.println("Name of Employee:" + e2.empName);
			System.out.println("Department ID:" + e2.depId);
			System.out.println("Salary Is:" + e2.salary);
		} else
			System.out.println("Both Employee Having Same Salary");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Datails Of Employee 1 ");
		System.out.println("Enetr Name Of Employee");
		String name = scanner.next();
		System.out.println("Enter DeptId Of Employee");
		int id = scanner.nextInt();
		System.out.println("Enter Salary Of Employee");
		int salary = scanner.nextInt();
		Employee_Assignment_40 employee1 = new Employee_Assignment_40(name, id, salary);
		System.out.println("--------------------------");
		System.out.println("Enter Datails Of Employee 2");

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter Name Of Employee 2");
		String name2 = scanner2.next();
		System.out.println("Enter DeptId Of Employee 2");
		int id2 = scanner2.nextInt();
		System.out.println("Enter Salary Of Employee 2");
		int salary2 = scanner.nextInt();
		Employee_Assignment_40 employee2 = new Employee_Assignment_40(name2, id2, salary2);
		System.out.println("Details Of Employee Having Max Salary");
		employee1.compareMaxSalary(employee1, employee2);
	}
}
