package ritika.Assignments.asgmt_40;

import java.util.Scanner;

/*Program - 1:
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner).
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);
*/
public class Employee {

	String empName;
	int deptID;
	int salary;

	public Employee(String empName, int deptID, int salary) {
		this.empName = empName;
		this.deptID = deptID;
		this.salary = salary;
	}

	void compareEmpSalary(Employee e1, Employee e2) {
		System.out.println("Details of employee having maximum salary:");
		if (e1.salary > e2.salary) {
			System.out.println("Name: " + e1.empName);
			System.out.println("Department ID: " + e1.deptID);
			System.out.println("Salary: " + e1.salary);
		} else if (e2.salary > e1.salary) {
			System.out.println("Name: " + e2.empName);
			System.out.println("Department ID: " + e2.deptID);
			System.out.println("Salary: " + e2.salary);
		} else {
			System.out.println("Both Employee's salary is same");
			System.out.println("Name: " + e1.empName);
			System.out.println("Department ID: " + e1.deptID);
			System.out.println("Salary: " + e1.salary);
			System.out.println("-----------------------------------------------------");
			System.out.println("Name: " + e2.empName);
			System.out.println("Department ID: " + e2.deptID);
			System.out.println("Salary: " + e2.salary);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first employee name: ");
		String empName1 = sc.next();
		System.out.println("Enter his/her department ID: ");
		int deptID1 = sc.nextInt();
		System.out.println("Enter his/her Salary: ");
		int salary1 = sc.nextInt();
		Employee e1 = new Employee(empName1, deptID1, salary1);

		System.out.println("Enter second employee name: ");
		String empName2 = sc.next();
		System.out.println("Enter his/her department ID: ");
		int deptID2 = sc.nextInt();
		System.out.println("Enter his/her Salary: ");
		int salary2 = sc.nextInt();
		Employee e2 = new Employee(empName2, deptID2, salary2);

		sc.close();
		e2.compareEmpSalary(e1, e2);
	}

}
