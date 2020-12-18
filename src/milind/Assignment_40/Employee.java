package milind.Assignment_40;

import java.util.Scanner;

public class Employee {
	
	String empName;
	int empID;
	double salary;
	
	public Employee(String empName, int empID, double salary) {
		this.empName = empName;
		this.empID = empID;
		this.salary = salary;
	}
	
	void compareEmpSalary(Employee e1, Employee e2) {
		if(e1.salary > e2.salary) {
			System.out.println("Employee Details : " );
			System.out.println("Emplyee Name : " + e1.empName);
			System.out.println("Employee Id" + e1.empID);
			System.out.println("Employee Salary " + e1.salary);
		}else if(e1.salary < e2.salary) {
			System.out.println("Employee Details : " );
			System.out.println("Emplyee Name : " + e2.empName);
			System.out.println("Employee Id : " + e2.empID);
			System.out.println("Employee Salary : " + e2.salary);
		}else {
			System.out.println(e1.empName + " and " + e2.empName + " are at same level");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee name : " );
		String empName = scanner.nextLine();
		System.out.println("Enter employee Id : ");
		int empID = scanner.nextInt();
		System.out.println("Enter employee salary : ");
		double salary = scanner.nextDouble();
		
		Employee e1 = new Employee(empName, empID, salary);
		
		System.out.println("Enter employee name : " );
		empName = scanner.next();
		System.out.println("Enter employee Id : ");
		empID = scanner.nextInt();
		System.out.println("Enter employee salary : ");
		salary = scanner.nextDouble();
		
		Employee e2 = new Employee(empName, empID, salary);
		
		e1.compareEmpSalary(e1, e2);
		scanner.close();
	}

}
