package raghvendra.Constructor;
import java.util.Scanner;
/*Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);*/ 
public class Employee2 {
	String employeeName;
	int departmentId;
	int salary;

	Employee2(String employeeName, int depId, int salary) {
		this.employeeName = employeeName;
		this.departmentId = depId;
		this.salary = salary;
	}

	void compareEmpSalary(Employee2 e1, Employee2 e2) {
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
		Employee2 employee1 = new Employee2(name, depId, salary);
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Enter the depId: ");
		depId = sc.nextInt();
		System.out.println("Enter the salary: ");
		salary = sc.nextInt();
		Employee2 employee2 = new Employee2(name, depId, salary);
		employee1.compareEmpSalary(employee1, employee2);
	}
}
