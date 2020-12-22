package ritika.Assignments.asgmt_41;

import java.util.Scanner;

/*Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, salary, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.
*/
public class Employee {
	
	private String firstName;
	private String lastName;
	private String deptName;
	private int empId;
	private int empDeptId;
	private int empAge;
	private int empSalary;
	private static int counter;
	
	void setEmployeeDetails() {
		counter++;
		System.out.println("Enter "+counter+ "th employee details: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name: ");
		this.firstName = sc.next();
		System.out.println("Last Name: ");
		this.lastName = sc.next();
		System.out.println("Departement Name: ");
		this.deptName = sc.next();
		System.out.println("Department ID: ");
		this.empDeptId = sc.nextInt();
		System.out.println("Employee ID: ");
		this.empId = sc.nextInt();
		System.out.println("Salary: ");
		this.empSalary = sc.nextInt(); 
		System.out.println("Age: ");
		this.empAge = sc.nextInt(); 
	}
	
	int getSalary() {
		return this.empSalary;
	}
	
	String getName() {
		return firstName;
	}
	
	int getAge() {
		return empAge;
	}
	
	void printEmployeeDetails() {
		System.out.println("Name -> " + firstName + " " + lastName);
		System.out.println("Department -> " +deptName);
		System.out.println("Department ID -> " +empDeptId);
		System.out.println("Employee ID -> " +empId);
		System.out.println("Salary -> " +empSalary);
		System.out.println("Age -> " +empAge);
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
