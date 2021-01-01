package nitin.Assignment_40;
import java.util.Scanner;
/* Assignment - 40: 16th Dec'2020 - Program - 1: 
Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) and 
print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2); */
public class Employee {
	String empName;
	double salary;
	int deptId;
	Employee(String empName, int deptId, double salary){
		this.empName=empName;
		this.deptId=deptId;
		this.salary=salary;
	}
	public static void compareEmpSalary(Employee e1, Employee e2) {
		if(e1.salary>e2.salary)
			System.out.println("Employee Name - "+e1.empName+" having maximum salary Rs."+e1.salary+" and belongs to Department Id "+e1.deptId);
		else if(e2.salary>e1.salary)
			System.out.println("Employee Name - "+e2.empName+" having maximum salary Rs."+e2.salary+" and belongs to Department Id "+e2.deptId);
		else
			System.out.println("Salary of both employees have no difference.");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter name of first Employee - ");
		String ename1 = scanner.next();
		System.out.print("Please enter Department Id of first Employee - ");
		int deptId1 = scanner.nextInt();
		System.out.print("Please enter salary of first Employee - ");
		double salary1 = scanner.nextDouble();
		Employee emp1 = new Employee(ename1,deptId1,salary1);
		System.out.println("");
		System.out.print("Please enter name of second Employee - ");
		String ename2 = scanner.next();
		System.out.print("Please enter Department Id of second Employee - ");
		int deptId2 = scanner.nextInt();
		System.out.print("Please enter salary of second Employee - ");
		double salary2 = scanner.nextDouble();
		Employee emp2 = new Employee(ename2,deptId2,salary2);
		System.out.println("");
		Employee.compareEmpSalary(emp1, emp2);
		scanner.close();
	}
}
