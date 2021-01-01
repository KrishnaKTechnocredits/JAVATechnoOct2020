package prasad;

import java.util.Scanner;

public class EmployeesSalMax {
	String empName;
	int deptId;
	int salary;
	
	EmployeesSalMax(String empName,int deptId,int salary){
		this.empName=empName;
		this.deptId=deptId;
		this.salary=salary;
	}
	
	static void compareEmpSalary(EmployeesSalMax e1, EmployeesSalMax e2) {
		
		if(e1.salary>e2.salary) {
			System.out.println("");
			System.out.println("Printing employee details with MAX salary:-");
			System.out.println("Employee Name: " + e1.empName);
			System.out.println("Employee department ID:- " + e1.deptId);
			System.out.println("Employee Salary(Per Annum):- "+" Rs "+e1.salary+ "/-");
		}
		else if(e2.salary>e1.salary) {
			System.out.println("");
			System.out.println("Printing employee details with MAX salary:-");
			System.out.println("Employee Name: " + e2.empName);
			System.out.println("Employee department ID:- " + e2.deptId);
			System.out.println("Employee Salary(Per Annum):- "+" Rs "+ e2.salary+ "/-");
		}
		else {
			System.out.println("");
			System.out.println("Both the employees have same salary");
		}
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter employee details:-");
		System.out.println("Enter employee name:");
		String name = scanner.next();
		System.out.println("Enter dept ID:");
		int dep = scanner.nextInt();
		System.out.println("Enter Salary(Per Annum):");
		int sal = scanner.nextInt();
		EmployeesSalMax e1 = new EmployeesSalMax(name,dep,sal);// Creating object for emp1
		
		System.out.println("");
		System.out.println("Please enter employee details:-");
		System.out.println("Enter employee name:");
		name = scanner.next();
		System.out.println("Enter dept ID:");
		dep = scanner.nextInt();
		System.out.println("Enter Salary(Per Annum):");
		sal = scanner.nextInt();
		EmployeesSalMax e2 = new EmployeesSalMax(name,dep,sal);// Creating object for emp2
		
		compareEmpSalary(e1,e2);
	}
}
