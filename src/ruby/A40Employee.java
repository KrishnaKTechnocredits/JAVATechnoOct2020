package ruby;

/*Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner).
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.*/
import java.util.Scanner;

public class A40Employee {
	int deptId, salary;
	String empName;

	public A40Employee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Employee name: ");
		empName = scan.next();
		System.out.println("Please enter Employee DeptID: ");
		deptId = scan.nextInt();
		System.out.println("Please enter salary: ");
		salary = scan.nextInt();
	}

	static void compareSalary(A40Employee emp1, A40Employee emp2) {
		if (emp1.salary > emp2.salary)
			System.out.println("Employee " + emp1.empName + " has max salary, DeptID: " + emp1.deptId + ", salary: "
					+ emp1.salary);
		else if (emp1.salary < emp2.salary)
			System.out.println("Employee " + emp2.empName + " has max salary, DeptID: " + emp2.deptId + ", salary: "
					+ emp2.salary);
		else
			System.out.println("Both are same salary");
	}

	public static void main(String[] args) {
		A40Employee emp1 = new A40Employee();
		A40Employee emp2 = new A40Employee();
		A40Employee.compareSalary(emp1, emp2);
	}
}
