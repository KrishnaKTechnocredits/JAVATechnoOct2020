/*Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); */
package suvela.assignment40.prog1;

import java.util.Scanner;

public class Employee {
	String emp_name;
	int dept_id;
	int salary;
	
	Employee(String emp_name,int dept_id,int salary){
		this.dept_id=dept_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	
	static void compareEmpSalary(Employee e1, Employee e2) {
		if(e1.salary > e2.salary) {
			System.out.println("Employee name:"+e1.emp_name);
			System.out.println("Employee dept Id:"+e1.dept_id);
			System.out.println("Employee name:"+e1.salary);
		}
			else {
			System.out.println("Employee name:"+e2.emp_name);
			System.out.println("Employee dept Id:"+e2.dept_id);
			System.out.println("Employee name:"+e2.salary);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String emp_name="";
		int dept_id=0;;
		int salary=0;
		System.out.println("Enter employee 1 information");
		System.out.println("Please enter employee name:");
		emp_name=sc.next();
		System.out.println("Please enter employee dept Id:");
		dept_id=sc.nextInt();
		System.out.println("Please enter employee salary:");
		salary=sc.nextInt();
		Employee e1= new Employee(emp_name,dept_id,salary);
		
		System.out.println("Enter employee 2 information");
		System.out.println("Please enter employee name:");
		emp_name=sc.next();
		System.out.println("Please enter employee dept Id:");
		dept_id=sc.nextInt();
		System.out.println("Please enter employee salary:");
		salary=sc.nextInt();
		Employee e2= new Employee(emp_name,dept_id,salary);
		
		Employee.compareEmpSalary(e1, e2);
	}

}
