package milind.Assignment39;

import java.util.Scanner;

public class Employee {
	
	int empId; 
	String empName; 
	double yearOfExperience;
	int salary;
	
	Employee(int empId, String empName, double yearOfExperience, int salary){
		this.empId = empId;
		this.empName = empName;
		this.yearOfExperience = yearOfExperience;
		this.salary = salary;
	}
	
	boolean isEligible(int salary) {
		if(salary > 30000) {
			return true;
		}else
			return false;
	}
	
	boolean isSwitchRequired(double yearOfExperience, int salary) {
		if(salary > (yearOfExperience * 200000))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee ID :");
		int empId = scanner.nextInt();
		
		System.out.println("Enter employee name :");
		String empName = scanner.next();
		
		System.out.println("Enter employee year of experience :");
		double yearOfExperience = scanner.nextDouble();
		
		System.out.println("Enter employee salary :");
		int salary = scanner.nextInt();
		
		Employee employee = new Employee(empId, empName, yearOfExperience, salary);
		
		if(employee.isEligible(salary))
			System.out.println(empId + ":" + empName + " is eligible");
		else
			System.out.println(empId + ":" + empName + " is not eligible");
		
		if(employee.isSwitchRequired(yearOfExperience, salary))
			System.out.println(empId + ":" + empName + " : switch is not required as experience is " + yearOfExperience + " and salary is  " + salary);
		else 
			System.out.println(empId + ":" + empName + " : switch is required as experience is " + yearOfExperience + " and salary is  " + salary);
		scanner.close();
	}

}
