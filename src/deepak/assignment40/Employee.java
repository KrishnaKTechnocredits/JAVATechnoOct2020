/*
 * Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); 
 */

package deepak.assignment40;

import java.util.Scanner;

public class Employee {
	
	String empName;
	int deptId;
	double sal;
	
	Employee(String empName, int deptId, double sal ){
		
		this.empName = empName;
		this.deptId = deptId;
		this.sal = sal;
	}
	
	void compareEmpSalary(Employee e1, Employee e2) {
		
		if(e1.sal>e2.sal) {
			
			System.out.println("Employee Details are :"+ " "+ e1.empName + " "+ e1.deptId + " "+ e1.sal  );
		}
		else
			System.out.println("Employee Details are :"+ " "+ e2.empName + " "+ e2.deptId + " "+ e2.sal  );
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Employee Name, Department ID and Salary");
		
		String empFirstname = sc.next();
		int empFirstdeptId = sc.nextInt();
		double empFirstsal = sc.nextDouble();
		
		Employee e1 = new Employee(empFirstname,empFirstdeptId,empFirstsal);
		
		
		System.out.println("Please Enter Second Employee Name, Department ID and Salary");
		
		String empSecondname = sc.next();
		int empSeconddeptId = sc.nextInt();
		double empSecondsal = sc.nextDouble();
		
		Employee e2 = new Employee(empSecondname,empSeconddeptId,empSecondsal);
		
		e2.compareEmpSalary(e1, e2);
	}

}
