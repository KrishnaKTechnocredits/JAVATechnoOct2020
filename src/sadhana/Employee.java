/* Assignment_40
Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.

HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);  */
package sadhana;

public class Employee {

	String employeeName;
	String deptId;
	int salary;

	Employee(String employeeName, String deptId, int salary){
		this.employeeName = employeeName;
		this.deptId = deptId;
		this.salary = salary;	
	}
	public static void empSalary(Employee e1,Employee e2) {
		if(e1.salary > e2.salary) 
			System.out.println("Employee name : "+e1.employeeName+ "  Department Id : "+e1.deptId+ "  Maximum Salary : "+e1.salary);
		else
			System.out.println("Employee name : "+e1.employeeName+ "  Department Id : "+e1.deptId+ "  Maximum Salary : "+e1.salary);
	}
	public static void main(String args[]) {
		Employee employee2 = new Employee("Sadhana","101",15000);
		Employee employee1 = new Employee("Bhaskar","201",97000);
		Employee.empSalary(employee1, employee2);
	}
}

