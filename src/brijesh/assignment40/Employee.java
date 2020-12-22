package brijesh.assignment40;

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
