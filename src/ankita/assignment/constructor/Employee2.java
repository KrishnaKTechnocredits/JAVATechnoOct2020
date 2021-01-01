/*Assignment - 40: 16th Dec'2020

Program - 1:
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner).
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);
*/

package ankita.assignment.constructor;

import java.util.Scanner;

public class Employee2 {
	String empNm;
	int deptID;
	int sal;

	public Employee2(String empNm, int deptID, int sal) {
		this.empNm = empNm;
		this.deptID = deptID;
		this.sal = sal;
	}

	static void compareEmpSalary(Employee2 e1, Employee2 e2) {

		if (e1.sal > e2.sal) {
			System.out.println("Employee Name : " + e1.empNm);
			System.out.println("Employee Dept : " + e1.deptID);
			System.out.println("Employee sal  : " + e1.sal);
		} else {
			System.out.println("Employee Name : " + e2.empNm);
			System.out.println("Employee Dept : " + e2.deptID);
			System.out.println("Employee sal  : " + e2.sal);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ename = "";
		int deptNum = 0;
		int salary = 0;
		System.out.println("Please Enter Details for Two Emplyees ");

		System.out.println("Please Enter Employee Name : ");
		ename = sc.next();
		System.out.println("Please Enter Employee  DeptID: ");
		deptNum = sc.nextInt();
		System.out.println("Please Enter Employee Salary : ");
		salary = sc.nextInt();
		Employee2 e1 = new Employee2(ename, deptNum, salary);

		System.out.println("Please Enter Employee Name : ");
		ename = sc.next();
		System.out.println("Please Enter Employee  DeptID: ");
		deptNum = sc.nextInt();
		System.out.println("Please Enter Employee Salary : ");
		salary = sc.nextInt();
		Employee2 e2 = new Employee2(ename, deptNum, salary);

		Employee2.compareEmpSalary(e1, e2);
		sc.close();
	}
}