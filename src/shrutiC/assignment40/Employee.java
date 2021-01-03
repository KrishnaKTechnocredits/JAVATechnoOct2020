package shrutiC.assignment40;

import java.util.Scanner;

public class Employee {

	String empName;
	int deptID;
	int salary;

	Employee(String empName, int deptID, int salary) {
		this.empName = empName;
		this.deptID = deptID;
		this.salary = salary;
	}

	static void compareEmpSalary(Employee e1, Employee e2) {
		if (e1.salary > e2.salary) {
			displayDetails(e1);
		} else if (e2.salary > e1.salary) {
			displayDetails(e2);
		} else
			System.out.println("Same salaried employees");
	}

	static void displayDetails(Employee e) {
		System.out.println("Employee name : " + e.empName);
		System.out.println("Employee salary : " + e.salary);
		System.out.println("Employee ID : " + e.deptID);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String empName = "";
		int empID = 0;
		int salary = 0;

		System.out.println("Enter Employee 1 name");
		empName = sc.next();
		System.out.println("Enter Employee id");
		empID = sc.nextInt();
		System.out.println("Enter Employee salary");
		salary = sc.nextInt();
		Employee e1 = new Employee(empName, empID, salary);

		System.out.println("Enter Employee 2 name");
		empName = sc.next();
		System.out.println("Enter Employee id");
		empID = sc.nextInt();
		System.out.println("Enter Employee salary");
		salary = sc.nextInt();
		Employee e2 = new Employee(empName, empID, salary);

		System.out.println("Employee details with highest salary are :");
		Employee.compareEmpSalary(e1, e2);
	}

}
