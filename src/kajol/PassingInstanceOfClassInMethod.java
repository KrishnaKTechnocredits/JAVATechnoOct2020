/*Assignment - 40: 

Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); */

package kajol;

import java.util.Scanner;

public class PassingInstanceOfClassInMethod {
	String employeeName;
	int departmentId;
	double salary;
	
	public PassingInstanceOfClassInMethod(String employeeName,int departmentId,double salary) {
		this.employeeName= employeeName;
		this.departmentId= departmentId;
		this.salary= salary;	
	}
	
	static void compareEmpSalary(PassingInstanceOfClassInMethod e1, PassingInstanceOfClassInMethod e2) {
		if(e1.salary>e2.salary) {
			System.out.println("Employee "+e1.employeeName+" has maximum Salary.");
			System.out.println("Department Id for Employee "+e1.employeeName+" is :"+e1.departmentId);
			System.out.println("Salary for Employee "+e1.employeeName+" is : "+e1.salary);
		}
		else if(e2.salary>e1.salary) {
			System.out.println("Employee "+e2.employeeName+" has maximum Salary.");
			System.out.println("Department Id for Employee "+e2.employeeName+" is :"+e2.departmentId);
			System.out.println("Salary for Employee "+e2.employeeName+" is : "+e2.salary);
		}
		else
			System.out.println("Both Employees have same Salary");		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Details for Employee 1 : ");
		System.out.println("Employee Name : ");
		String name1=sc.next();
		System.out.println("Employee Department Id : ");
		int deptId1=sc.nextInt();
		System.out.println("Employee Salary : ");
		double salary1=sc.nextDouble();
		System.out.println();
		PassingInstanceOfClassInMethod employee1= new PassingInstanceOfClassInMethod(name1, deptId1, salary1);
		System.out.println("Please Enter Details for Employee 2 : ");
		System.out.println("Employee Name : ");
		String name2=sc.next();
		System.out.println("Employee Department Id : ");
		int deptId2=sc.nextInt();
		System.out.println("Employee Salary : ");
		double salary2=sc.nextDouble();
		System.out.println();
		PassingInstanceOfClassInMethod employee2= new PassingInstanceOfClassInMethod(name2, deptId2, salary2);
		PassingInstanceOfClassInMethod.compareEmpSalary(employee1, employee2);	
		sc.close();
	}
}
