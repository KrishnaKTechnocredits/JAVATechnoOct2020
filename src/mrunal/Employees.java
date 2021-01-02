
/*Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary 
(input usingscanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments 
(instance of bothemployees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);*/ 

package mrunal;
import java.util.Scanner;

public class Employees {
	String employeeName;
	int departmentId;
	int salary;

	Employees(String employeeName, int depId, int salary) {
		this.employeeName = employeeName;
		this.departmentId = depId;
		this.salary = salary;
	}

	void compareEmpSalary(Employees e1, Employees e2) {
		if (e1.salary > e2.salary) {
			System.out.println("Name of emplyee having maximum salary: "+e1.employeeName);
			System.out.println("Department: "+e1.departmentId);
			System.out.println("Salary:"+e1.salary);
		} else if(e2.salary>e1.salary) {
			System.out.println("Name of emplyee having maximum salary: "+e2.employeeName);
			System.out.println("Department: "+e2.departmentId);
			System.out.println("Salary:"+e2.salary);
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
		Employees employee1 = new Employees(name, depId, salary);
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Enter the depId: ");
		depId = sc.nextInt();
		System.out.println("Enter the salary: ");
		salary = sc.nextInt();
		Employees employee2 = new Employees(name, depId, salary);
		employee1.compareEmpSalary(employee1, employee2);
	}
}
